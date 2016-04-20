package com.company;

/**
 * Created by Nikhil on 4/20/16.
 */
public class routingTreeNode {
    int startIP;
    int endIP;
    int nextIP;
    routingTreeNode left;
    routingTreeNode right;

    public routingTreeNode(int startIP, int endIP, int nextIP) {
        this.startIP = startIP;
        this.endIP = endIP;
        this.nextIP = nextIP;
        this.left = null;
        this.right = null;
    }


}
