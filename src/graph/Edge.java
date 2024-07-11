package graph;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;
    public Edge(Vertex startV,Vertex endV,Integer inputWeight){
        this.start=startV;
        this.end=endV;
        this.weight=inputWeight;
    }
    //To get start Vertex or node
    public Vertex getStart(){
        return this.end;
    }
    //To get end Vertex or node
    public Vertex getEnd(){
        return  this.end;
    }
    //To get Weight from graph
    public Integer getWeight(){
        return this.weight;
    }
}
