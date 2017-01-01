package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutAssertions {

    @Koan
    public void assertBooleanTrue() {
        // there are two possibilities, true or false, what would it be here?
        assertTrue(true);
    }

    @Koan
    public void assertBooleanFalse() {
        assertFalse(false);
    }

    @Koan
    public void assertNullObject() {
        // reference to the object can be null, a magic keyword, null, which means
        // that there is nothing there
        assertNull(null);
    }

    @Koan
    public void assertNullObjectReference() {
        Object someObject = null;
        assertNull(someObject);
    }

    @Koan
    public void assertNotNullObject() {
        // but what when there should not be a null value?
        assertNotNull(1);
    }

    @Koan
    public void assertEqualsUsingExpression() {
        assertTrue("Hello World!".equals("Hello World!"));
    }

    @Koan
    public void assertEqualsWithAFewExpressions() {
        assertEquals("Hello World!", "Hello World!");
        assertEquals(1, 2-1);
        assertEquals(2 + 2, 2+2);
        assertEquals(2 * 3, 2*3);
        assertEquals(3 - 8, 3-8);
        assertEquals(10 / 2, 10/2);
    }

    @Koan
    public void assertEqualsWithDescriptiveMessage() {
        // Generally, when using an assertXXX methods, expectation is on the
        // left and it is best practice to use a String for the first arg
        // indication what has failed
        assertEquals("The answer to 'life the universe and everything' should be 42", 42, 42);
    }

    @Koan
    public void assertSameInstance() {
        // Just because something is equal doesn't mean that it is the same.
        // It's only the same if the reference is the same.
        Object same = new Integer(1);
        Object sameReference = new Integer(1);
        assertSame(sameReference, sameReference);
    }

    @Koan
    public void assertNotSameInstance() {
        Object same = new Integer(1);
        Object sameReference = 1;
        assertNotSame(same, sameReference);
    }
}
