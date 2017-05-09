import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
532. K-diff Pairs in an Array

Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

1.The pairs (i, j) and (j, i) count as the same pair.
2.The length of the array won't exceed 10,000.
3.All the integers in the given input belong to the range: [-1e7, 1e7].

*/
public class KdiffPairsinanArray {
    public static void main(String[] args) {
        int[] test = {399, 242, 72, 520, 289, 399, 459, 104, 475, 109, 371, 509, 357, 409, 239, 113, 12, 220, 142, 115, 64, 374, 403, 158, 87, 118, 230, 224, 221, 56, 372, 488, 145, 448, 60, 46, 397, 230, 440, 58, 457, 176, 69, 330, 280, 138, 139, 80, 505, 381, 64, 93, 275, 495, 313, 293, 517, 396, 239, 123, 499, 438, 195, 2, 246, 46, 393, 364, 118, 153, 86, 289, 462, 352, 193, 185, 447, 104, 231, 208, 137, 476, 494, 212, 174, 501, 283, 93, 182, 56, 353, 175, 366, 375, 56, 312, 254, 227, 238, 349, 510, 235, 108, 25, 363, 260, 381, 72, 24, 456, 336, 221, 313, 518, 370, 281, 511, 125, 449, 196, 503, 376, 252, 144, 410, 476, 311, 511, 428, 498, 213, 428, 500, 516, 252, 219, 370, 300, 379, 66, 161, 412, 452, 21, 325, 392, 460, 7, 319, 496, 450, 176, 36, 155, 484, 442, 137, 45, 410, 242, 378, 271, 492, 443, 81, 199, 287, 185, 100, 248, 186, 450, 301, 2, 150, 198, 315, 88, 111, 137, 413, 241, 397, 370, 309, 0, 181, 332, 342, 458, 51, 466, 483, 385, 127, 3, 20, 520, 170, 294, 297, 367, 153, 488, 41, 524, 236, 496, 136, 450, 50, 436, 401, 467, 274, 263, 74, 495, 516, 218, 136, 377, 462, 383, 378, 139, 487, 316, 103, 468, 524, 340, 237, 414, 474, 364, 102, 318, 388, 202, 178, 284, 318, 212, 65, 246, 129, 213, 372, 289, 21, 163, 518, 375, 246, 281, 430, 251, 284, 502, 519, 33, 125, 412, 306, 418, 460, 7, 478, 80, 355, 486, 429, 369, 309, 339, 76, 193, 375, 452, 98, 276, 144, 435, 44, 260, 121, 4, 498, 393, 354, 241, 450, 251, 24, 339, 367, 429, 386, 20, 433, 85, 34, 355, 117, 237, 376, 365, 501, 357, 500, 447, 258, 465, 173, 221, 280, 2, 150, 40, 394, 459, 166, 191, 378, 119, 245, 102, 459, 256, 382, 116, 243, 79, 71, 80, 10, 471, 59, 248, 450, 412, 134, 225, 377, 438, 416, 502, 174, 281, 124, 142, 80, 95, 307, 97, 212, 490, 255, 499, 184, 30, 7, 243, 487, 0, 410, 210, 228, 203, 307, 162, 443, 9, 378, 182, 489, 311, 450, 286, 51, 392, 67, 408, 25, 306, 375, 181, 272, 437, 77, 171, 308, 43, 389, 443, 461, 469, 421, 215, 359, 193, 330, 263, 446, 332, 397, 154, 418, 244, 110, 334, 429, 213, 26, 356, 25, 419, 30, 418, 426, 406, 156, 448, 340, 297, 221, 41, 361, 223, 216, 5, 492, 311, 186, 25, 331, 431, 467, 111, 77, 217, 55, 289, 418, 240, 129, 251, 338, 4, 504, 339, 19, 134, 500, 347, 285, 277, 99, 300, 180, 396, 411, 522, 225, 367, 442, 110, 508, 165, 388, 410, 82, 16, 496, 21, 131, 400, 493, 378, 191, 76, 412, 105, 135, 138, 261, 219, 459, 397, 335, 368, 203, 40, 92, 368, 494, 207, 210, 280, 106, 29, 94, 132, 196, 186, 355, 292, 361, 26, 317, 504, 148, 520, 465, 507, 352, 504, 66, 320, 273, 372, 515, 251, 461, 287, 259, 62, 138, 234, 381, 172, 387, 152, 329, 520, 159, 484, 377, 417, 137, 302, 56, 479, 257, 15, 74, 401, 477, 449, 325, 426, 298, 141, 34, 434, 255, 260, 297, 128, 431, 475, 130, 487, 269, 401, 463, 335, 129, 81, 327, 106, 451, 153, 310, 241, 100, 112, 312, 257, 207, 356, 449, 273, 377, 80, 312, 363, 184, 255, 474, 447, 94, 361, 44, 325, 101, 427, 370, 67, 250, 209, 130, 115, 63, 317, 209, 483, 19, 426, 115, 146, 46, 117, 22, 427, 100, 300, 480, 305, 274, 429, 458, 244, 387, 358, 207, 115, 479, 143, 324, 339, 373, 496, 209, 7, 490, 328, 71, 457, 456, 269, 483, 394, 228, 409, 271, 399, 92, 105, 36, 137, 448, 72, 261, 414, 5, 69, 23, 63, 358, 60, 496, 103, 485, 130, 37, 113, 186, 63, 449, 364, 92, 323, 268, 37, 469, 468, 350, 41, 476, 70, 273, 462, 406, 315, 271, 102, 38, 514, 10, 224, 67, 372, 135, 451, 291, 399, 267, 397, 361, 40, 199, 394, 86, 80, 2, 501, 319, 96, 89, 287, 255, 0, 431, 195, 329, 212, 34, 480, 112, 52, 335, 379, 52, 452, 388, 523, 205, 249, 23, 119, 41, 381, 335, 232, 105, 231, 207, 76, 95, 202, 359, 304, 85, 98, 384, 498, 443, 186, 222, 193, 245, 356, 165, 477, 145, 367, 505, 103, 273, 86, 106, 254, 357, 11, 409, 347, 288, 320, 436, 174, 166, 126, 261, 17, 126, 445, 399, 475, 426, 10, 288, 159, 390, 434, 210, 41, 432, 323, 454, 512, 50, 130, 121, 364, 20, 174, 11, 123, 469, 381, 122, 67, 72, 203, 175, 35, 479, 193, 244, 404, 505, 413, 34, 408, 75, 40, 317, 333, 266, 373, 182, 406, 481, 345, 522, 378, 46, 433, 300, 255, 314, 485, 346, 133, 250, 473, 217, 222, 457, 264, 445, 311, 263, 190, 378, 246, 358, 293, 252, 76, 512, 128, 471, 505, 391, 286, 354, 118, 263, 274, 182, 429, 307, 201, 35, 493, 71, 384, 498, 13, 82, 192, 441, 426, 23, 74, 146, 28, 466, 351, 136, 297, 292, 484, 308, 373, 32, 191, 1, 365, 47, 313, 210, 212, 281, 116, 50, 306, 79, 121, 338, 215, 396, 173, 503, 216, 337, 497, 68, 331, 506, 365, 209, 132, 249, 1, 226, 85, 10, 12, 110, 407, 124, 499, 387, 300, 184, 232, 460, 345, 440, 338, 353, 52, 405, 464, 33, 113, 108, 232, 25, 376, 414, 355, 244, 136, 383, 266, 224, 76, 127, 273, 459, 477, 16, 416, 224, 17, 131, 470, 120, 65, 28, 275, 317, 517, 257, 278, 166, 227, 484, 367, 191, 177, 178, 102, 443, 212, 196, 423, 269, 87, 154, 171, 363, 235, 382, 253, 211, 22, 92, 306, 265, 15, 379, 422, 37, 103};
        //int[] test = {371, 293, 254, 332};
        System.out.println(new KdiffPairsinanArray().findPairs(test, 39));
    }

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int num : nums) {
            int count = 0;
            if (map.containsKey(num)) {
                count = map.get(num);
            }
            map.put(num, count + 1);



        }
        return result;

    }
}

