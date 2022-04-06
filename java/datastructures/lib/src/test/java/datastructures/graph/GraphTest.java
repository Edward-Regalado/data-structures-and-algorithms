package datastructures.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

  @Test
  @DisplayName("empty graph")
  void emptyGraph()
  {
    Graph<String> graph = new Graph<>();
    System.out.println(graph);
    assertEquals(graph.toString(), "");
  }

  @Test
  @DisplayName("get graph size")
  void getGraphSize()
  {
    Graph<String> graph = new Graph<>();
    graph.addVertex("SEA");
    graph.addVertex("LAX");
    graph.addVertex("ORD");
    assertEquals(3, graph.size());
  }

  @Test
  @DisplayName("add single vertex")
  void addSingleVertex()
  {
    Graph<String> graph = new Graph<>();
    graph.addVertex("SEA");
    String string = graph.getVertices().toString();
    System.out.println(string);
    assertEquals("[SEA]", string);
  }

  @Test
  @DisplayName("add multiple vertices")
  void addMultipleVertices()
  {
    Graph<String> graph = new Graph<>();
    graph.addVertex("SEA");
    graph.addVertex("LAX");
    graph.addVertex("ORD");
    assertEquals("[SEA, LAX, ORD]", graph.getVertices().toString());
    System.out.println(graph.getVertices());
  }

  @Test
  @DisplayName("add multiple vertices with edges")
  void addMultipleVerticesWithEdges()
  {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("SEA");
    Vertex<String> v2 = graph.addVertex("LAX");
    Vertex<String> v3 = graph.addVertex("ORD");
    Vertex<String> v4 = graph.addVertex("PHX");
    Vertex<String> v5 = graph.addVertex("DEN");

    graph.addEdge(v1, v2);
    graph.addEdge(v1, v3);
    graph.addEdge(v1, v4);
    graph.addEdge(v1, v5);

    graph.addEdge(v2, v1);
    graph.addEdge(v2, v3);
    graph.addEdge(v2, v5);
    String string =
      """
        SEA: LAX(weight 0) -> ORD(weight 0) -> PHX(weight 0) -> DEN(weight 0) -> null
        LAX: SEA(weight 0) -> ORD(weight 0) -> DEN(weight 0) -> null
        ORD: null
        PHX: null
        DEN: null
        """;
    assertEquals(string, graph.toString());
  }

  @Test
  @DisplayName("add multiple vertices with edges and weights")
  void addMultipleVerticesWithEdgesAndWeights()
  {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = new Vertex<>("SEA");
    Vertex<String> v2 = new Vertex<>("LAX");
    Vertex<String> v3 = new Vertex<>("ORD");
    Vertex<String> v4 = new Vertex<>("PHX");
    Vertex<String> v5 = new Vertex<>("DEN");

    graph.addEdge(v1, v2, 2);
    graph.addEdge(v1, v3, 6);
    graph.addEdge(v1, v4, 5);
    graph.addEdge(v1, v5, 3);

    graph.addEdge(v2, v1, 2);
    graph.addEdge(v2, v3, 6);
    graph.addEdge(v2, v5, 5);

    String seaNeighbors = "[Edge{destination=LAX, weight=2}, Edge{destination=ORD, weight=6}, Edge{destination=PHX, weight=5}, Edge{destination=DEN, weight=3}]";
    String laxNeighbors = "[Edge{destination=SEA, weight=2}, Edge{destination=ORD, weight=6}, Edge{destination=DEN, weight=5}]";
    assertEquals(seaNeighbors, graph.getNeighbors(v1).toString());
    assertEquals(laxNeighbors, graph.getNeighbors(v2).toString());
  }

////// BREADTH FIRST SEARCH /////////
  @Test
  @DisplayName("breadth first search single vertex with string")
  void breadthFirstSearchSingleVertexString()
  {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("SEA");
    assertEquals("[SEA]", graph.breadthFirst(v1).toString());
  }

  @Test
  @DisplayName("breadth first search single vertex with Integer")
  void breadthFirstSearchSingleVertexInteger()
  {
    Graph<Integer> graph = new Graph<>();
    Vertex<Integer> v1 = graph.addVertex(100);
    assertEquals("[100]", graph.breadthFirst(v1).toString());
  }

  @Test
  @DisplayName("breadth first search multiple vertices with strings")
  void breadthFirstSearchMultipleVerticesString()
  {
    Graph<String> graph = new Graph<>();

    Vertex<String> v1 = graph.addVertex("SEA");
    Vertex<String> v2 = graph.addVertex("LAX");
    Vertex<String> v3 = graph.addVertex("ORD");
    Vertex<String> v4 = graph.addVertex("PHX");
    Vertex<String> v5 = graph.addVertex("DEN");

    graph.addEdge(v1, v2, 2);
    graph.addEdge(v2, v1, 2);
    graph.addEdge(v1, v3, 6);
    graph.addEdge(v1, v4, 5);
    graph.addEdge(v1, v5, 3);
    assertEquals("[SEA, LAX, ORD, PHX, DEN]", graph.breadthFirst(v1).toString());
  }

  @Test
  @DisplayName("breadth first search multiple vertices with integers")
  void breadthFirstSearchMultipleVerticesIntegers()
  {
    Graph<Integer> graph = new Graph<>();

    Vertex<Integer> v1 = graph.addVertex(100);
    Vertex<Integer> v2 = graph.addVertex(200);
    Vertex<Integer> v3 = graph.addVertex(300);
    Vertex<Integer> v4 = graph.addVertex(400);
    Vertex<Integer> v5 = graph.addVertex(500);

    graph.addEdge(v1, v2, 2);
    graph.addEdge(v2, v1, 2);
    graph.addEdge(v1, v3, 6);
    graph.addEdge(v1, v4, 5);
    graph.addEdge(v1, v5, 3);
    assertEquals("[100, 200, 300, 400, 500]", graph.breadthFirst(v1).toString());
  }
}
