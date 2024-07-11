package graph;

import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    //For every object of Vertex (data,ArrayList) will be created
    public Vertex(String inputData){
        this.data=inputData;
        this.edges=new ArrayList<Edge>();
    }
    //current vertex will be in the context that's why passing endVertex
    public void addEdge(Vertex endVertex,Integer weight){
        this.edges.add(new Edge(this,endVertex,weight));
    }
    //To remove edge
    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }
    //To get Vertex Data
    public String getData(){
        return this.data;
    }
    //To get Edge List
    public ArrayList<Edge> getEdges(){
        return this.edges;
    }
    public void print(boolean showWeight){
        String message="";
        if(this.edges.isEmpty()){
            System.out.println(this.data+" -->");
            return;
        }
        for(int i=0;i<this.edges.size();i++){
           if(i==0){
               message+=this.edges.get(i).getStart().data+" -->";
           }
           message+=this.edges.get(i).getEnd().data;
           if(showWeight){
               message+=" ( "+this.edges.get(i).getWeight() +")";
           }
        }
        System.out.println(message);
    }
}
