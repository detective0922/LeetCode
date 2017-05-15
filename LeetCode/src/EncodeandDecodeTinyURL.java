/*
535. Encode and Decode TinyURL

Note: This is a companion problem to the System Design problem: Design TinyURL.

TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service.
There is no restriction on how your encode/decode algorithm should work.
You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

*/

import java.util.ArrayList;
import java.util.List;

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
public class EncodeandDecodeTinyURL {
    // Encodes a URL to a shortened URL.
    private List<String> urlList = new ArrayList<String>();
    public String encode(String longUrl) {
        urlList.add(longUrl);
        return String.valueOf(urlList.size());
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int size = Integer.parseInt(shortUrl);
        return urlList.get(size - 1);
    }
}
