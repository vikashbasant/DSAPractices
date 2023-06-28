package enumorenumration;

/**
 * Inheritance concept is not applicable for enum's explicitly.
 * Hence, we can't apply extends keyword for enum.
 */

// =>> Example 1: <<= //
/*enum X{}

enum Y extends X{} // <<= Cannot inherit from enum 'enumorenumration.X'*/

// =>> Example 2: <<= //
/*enum X{}
enum Y extends java.lang.Enum{} // <<= No extends clause allowed for enum*/

// =>> Example 3: <<= //
/*class X{}
enum y extends X{} // <<= No extends clause allowed for enum*/

// =>> Example 4: <<= //
/*enum X{}
class Y extends X{} // <<= Cannot inherit from final enum 'enumorenumration.X'*/


public class TestEnum {
}
