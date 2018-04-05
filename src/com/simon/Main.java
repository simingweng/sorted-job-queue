package com.simon;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * given a sorted job Id queue, re-arrange the items so that
 * from beginning of the queue to the "index"th elements are
 * all the unique job Ids in order, return the value of this
 * "index"
 */

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());
    private static final int[] queue = {1, 2, 3, 3, 4, 4, 4, 5};

    public static void main(String[] args) {
        int maxJobId = 0;
        int tailIndex = 0;
        for (int jobId : queue) {
            if (jobId > maxJobId) {
                queue[tailIndex] = jobId;
                tailIndex++;
                maxJobId = jobId;
            }
        }
        logger.log(Level.INFO, "re-arranged queue: {0}", Arrays.toString(queue));
        logger.log(Level.INFO, "number of unique job Id: {0}", tailIndex);
    }
}
