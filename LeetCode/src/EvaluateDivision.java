import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
399. Evaluate Division

Equations are given in the format A / B = k, where A and B are variables represented as strings,
and k is a real number (floating point number). Given some queries, return the answers. If the answer does not exist, return -1.0.

Example:
 Given  a / b = 2.0, b / c = 3.0.
queries are:  a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
return  [6.0, 0.5, -1.0, 1.0, -1.0 ].

The input is:  vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries ,
where equations.size() == values.size(), and the values are positive. This represents the equations. Return  vector<double>.

According to the example above:
equations = [ ["a", "b"], ["b", "c"] ],
values = [2.0, 3.0],
queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].


The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.


*/
public class EvaluateDivision {
    public static void main(String[] args) {
        String[][] equations = {{"a","b"},{"b","c"}};
        double[] values ={2.0,3.0};
        String[][] queries = {{"a","c"},{"b","c"},{"a","e"},{"a","a"},{"x","x"}};

        new EvaluateDivision().calcEquation(equations,values,queries);
    }
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        double[] answers = new double[queries.length];
        Map<String, ArrayList<String>> edges = new HashMap<String, ArrayList<String>>();
        Map<String, ArrayList<Double>> weights = new HashMap<String, ArrayList<Double>>();
        for (int i = 0; i < equations.length; i++) {
            if (!edges.containsKey(equations[i][0])) {
                edges.put(equations[i][0], new ArrayList<String>());
                weights.put(equations[i][0], new ArrayList<Double>());
            }
            if (!edges.containsKey(equations[i][1])) {
                edges.put(equations[i][1], new ArrayList<String>());
                weights.put(equations[i][1], new ArrayList<Double>());
            }
            edges.get(equations[i][0]).add(equations[i][1]);
            edges.get(equations[i][1]).add(equations[i][0]);
            weights.get(equations[i][0]).add(values[i]);
            weights.get(equations[i][1]).add(1/values[i]);
        }

        for (int i = 0; i < queries.length; i++) {
            answers[i] = dfs(queries[i][0], queries[i][1], edges, weights, new ArrayList<String>(), 1.0);
        }
        return answers;
    }

    private double dfs(String v, String w, Map<String, ArrayList<String>> edges, Map<String, ArrayList<Double>> weights, ArrayList<String> visited, double currentWeight) {
        if (visited.contains(v)) {
            return -1.0;
        }
        if (!edges.containsKey(v)) {
            return -1.0;
        }
        if(v.equals(w)) {
            return currentWeight;
        }

        visited.add(v);
        List<String> subEdges = edges.get(v);
        List<Double> subWeights = weights.get(v);
        double tmpWeight = 0.0;
        for (int i = 0; i < subEdges.size(); i++) {
            tmpWeight = dfs(subEdges.get(i), w, edges, weights, visited, currentWeight * subWeights.get(i));
            if (tmpWeight != -1.0) {
                break;
            }
        }
        visited.remove(v);
        return tmpWeight;
    }
}
