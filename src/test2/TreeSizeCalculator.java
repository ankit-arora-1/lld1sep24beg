package test2;

import java.util.concurrent.ExecutorService;

public class TreeSizeCalculator {

    public int findSize(Node node, ExecutorService executorService) {
        if(node == null) {
            return 0;
        }

        int count = findSize(node.left, executorService);
        int countright = findSize(node.right, executorService);

        return count + countright;
    }
}
