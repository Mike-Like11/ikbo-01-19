package pract_8;

/**
 *
 */
public class UnfairWaitList<E> extends WaitList<E> {
    /**
     *
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * @return
     */

    public void remove(E element) {
       this.remove(element);
    }
    public void moveToBack(E element){
       // this.remove(element);
        super.add(element);
    }
}

