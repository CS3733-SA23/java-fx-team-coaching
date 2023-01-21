package edu.wpi.teamname;

public class Edge {
    String edgeID;
    Node node1;
    Node node2;

    public Edge(String edgeID, Node node1, Node node2) {
        this.edgeID = edgeID;
        this.node1 = node1;
        this.node2 = node2;
    }
}
