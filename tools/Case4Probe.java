import com.program.training.algorithm.minimumwindowsubstring.MinimumWindowSubstringAlgorithm;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;

public class Case4Probe
{
    public static void main(String[] args) throws Exception
    {
        String testSource = Files.readString(Path.of(
                "src/test/java/com/program/training/algorithm/minimumwindowsubstring/MinimumWindowSubstringAlgorithmTest.java"));
        String s = extractString(testSource, "case4", "String s = \"", "\";");
        String t = extractString(testSource, "case4", "String t = \"", "\";");
        String expected = extractString(testSource, "case4", "String output = \"", "\";");

        MinimumWindowSubstringAlgorithm algo = new MinimumWindowSubstringAlgorithm();
        String opt = algo.minWindowOpt(s, t);
        String basic = algo.minWindow(s, t);

        System.out.println("s.length=" + s.length());
        System.out.println("t.length=" + t.length());
        System.out.println("expected.length=" + expected.length());
        System.out.println("opt.length=" + opt.length());
        System.out.println("basic.length=" + basic.length());
        System.out.println("opt.equals(expected)=" + opt.equals(expected));
        System.out.println("basic.equals(expected)=" + basic.equals(expected));
        if (!opt.equals(expected))
        {
            System.out.println("first diff opt vs expected at: " + firstDiff(opt, expected));
        }
        if (!basic.equals(expected))
        {
            System.out.println("first diff basic vs expected at: " + firstDiff(basic, expected));
        }
    }

    private static String extractString(String source, String method, String startToken, String endToken)
    {
        int methodIdx = source.indexOf("void " + method + "()");
        if (methodIdx < 0)
        {
            throw new IllegalStateException("method not found: " + method);
        }
        int start = source.indexOf(startToken, methodIdx);
        if (start < 0)
        {
            throw new IllegalStateException("start token not found: " + startToken);
        }
        start += startToken.length();
        int end = source.indexOf(endToken, start);
        return source.substring(start, end);
    }

    private static int firstDiff(String a, String b)
    {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                return i;
            }
        }
        return len;
    }
}
