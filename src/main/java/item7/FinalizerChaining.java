package item7;

/**
 * Created by zhiqu on 7/12/16.
 */
public class FinalizerChaining {

    /**
     * One way: Finalizer Guardian idiom.
     *
     * Sole purpose of this object is to finalize outer Foo object
     */
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            // Finalize outer object
        }
    };

    /**
     * Another way: Manual finalizer chaining (Not prefered)
     **/
    @Override
    protected void finalize() throws Throwable {
        try {
            // Finalize subclass state
        } finally {
            super.finalize();  // This must be called
        }
    }
}
