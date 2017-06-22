package uk.co.unitesoftware.credKeeper;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by adam on 21/06/2017.
 */
public class Maths{
    static final Logger logger = LogManager.getLogger(Maths.class.getName());

    public int add(int i, int j){
        logger.info("add i="+i+" j="+j);
        return i + j;
    }
}
