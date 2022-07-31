package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {


    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while(this.stringIterator.hasNext()) {
            if (this.stringIterator.hasNext()) { // has next return true if iteration has more elements.
                this.copied += this.stringIterator.hasNext() + " ";
            }
        }
    }
}
