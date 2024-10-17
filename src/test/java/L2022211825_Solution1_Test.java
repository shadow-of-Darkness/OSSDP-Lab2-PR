import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试类 L12345_1_Test
 *
 * 测试用例设计原则：
 * 1. **等价类划分**：测试包含循环小数和非循环小数两类情况，且需考虑正负号。
 * 2. **边界测试**：测试极值（如 Integer.MAX_VALUE, Integer.MIN_VALUE），以及分母为1、分母为负数的情况。
 * 3. **异常情况**：测试分母为0的情况（这里假定输入是合法的整数）。
 */
public class L2022211825_Solution1_Test {

    // 实例化 Solution1 类
    Solution1 solution = new Solution1();

    @Test
    public void testNonRepeatingDecimal() {
        // 测试目的：验证非循环小数的转换
        // 测试用例：1/2 -> "0.5"
        assertEquals("0.5", solution.fractionToDecimal(1, 2));

        // 测试用例：2/1 -> "2"
        assertEquals("2", solution.fractionToDecimal(2, 1));

        // 测试用例：-25/4 -> "-6.25"
        assertEquals("-6.25", solution.fractionToDecimal(-25, 4));
    }

    @Test
    public void testRepeatingDecimal() {
        // 测试目的：验证循环小数的转换
        // 测试用例：1/3 -> "0.(3)"
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));

        // 测试用例：4/333 -> "0.(012)"
        assertEquals("0.(012)", solution.fractionToDecimal(4, 333));

        // 测试用例：2/7 -> "0.(285714)"
        assertEquals("0.(285714)", solution.fractionToDecimal(2, 7));
    }

    @Test
    public void testNegativeFraction() {
        // 测试目的：验证负数结果的正确性
        // 测试用例：-1/2 -> "-0.5"
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));

        // 测试用例：1/-3 -> "-0.(3)"
        assertEquals("-0.(3)", solution.fractionToDecimal(1, -3));

        // 测试用例：-1/-3 -> "0.(3)"
        assertEquals("0.(3)", solution.fractionToDecimal(-1, -3));
    }

    @Test
    public void testEdgeCases() {
        // 测试目的：验证极值情况
        // 测试用例：Integer.MIN_VALUE/1 -> "-2147483648"
        assertEquals("-2147483648", solution.fractionToDecimal(Integer.MIN_VALUE, 1));

        // 测试用例：0/1 -> "0"
        assertEquals("0", solution.fractionToDecimal(0, 1));
    }
}