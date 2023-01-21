package edu.wpi.teamname;

public class Node {
    String nodeID;
    int xcooord;
    int ycooord;
    int floorNumber;
    String building;
    NodeType nodeType;
    String longName;
    String shortName;

    public Node(String nodeID, int xcoord, int ycoord, int floorNumber, String building, NodeType nodeType, String longName, String shortName){
        this.nodeID = nodeID;
        this.xcooord = xcoord;
        this.ycooord = ycoord;
        this.floorNumber = floorNumber;
        this.building = building;
        this.nodeType = nodeType;
        this.longName = longName;
        this.shortName = shortName;
    }
}
