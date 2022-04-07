package datastructures.graph;

import datastructures.queue.Queue;
import java.util.*;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>
{
  public LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph()
  {
    adjacencyLists = new LinkedHashMap<>();
  }

  public Graph(int numberOfVertices)
  {
    adjacencyLists = new LinkedHashMap<>(numberOfVertices);
  }

  public Vertex<T> addVertex(T value)
  {
    Vertex<T> vertex = new Vertex<>(value);
    if(adjacencyLists.get(vertex) == null)
    {
    adjacencyLists.put(vertex, new LinkedList<>());
    numberOfVertices++;
    }
    return vertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    Edge<T> edge = new Edge<>(destination, weight);
    if (adjacencyLists.get(start) == null)
    {
      LinkedList<Edge<T>> linkedList = new LinkedList<>();
      linkedList.add(edge);
      adjacencyLists.put(start, linkedList);
    } else
    {
      LinkedList<Edge<T>> linkedList = adjacencyLists.get(start);
      linkedList.add(edge);
      adjacencyLists.put(start, linkedList);
    }
  }

  public List<Vertex<T>> getVertices()
  {
    return new ArrayList<>(adjacencyLists.keySet());
  }

  public List<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    LinkedList<Edge<T>> linkedList = adjacencyLists.get(vertex);
    return new ArrayList<>(linkedList);
  }

  public List<Vertex<T>> breadthFirst(Vertex<T> startVertex)
  {
    List<Vertex<T>> list = new ArrayList<>();
    Queue<Vertex<T>> queue = new Queue<>();
    HashSet<T> visited = new HashSet<>();

    visited.add(startVertex.value);
    queue.enqueue(startVertex);
    while(!queue.isEmpty())
    {
      Vertex<T> front = queue.dequeue();
      list.add(front);
      List<Edge<T>> edgeList = getNeighbors(front);
      for(Edge<T> edge : edgeList)
      {
        Vertex<T> neighborVertices = edge.destination;
        if(!visited.contains(neighborVertices.value))
        {
          queue.enqueue(neighborVertices);
          visited.add(neighborVertices.value);
        }
      }
    }
    return list;
  }

  public List<Edge<T>> depthFirst()
  {
    return null;
  }

  public int size()
  {
    return numberOfVertices;
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    StringBuilder graphString = new StringBuilder();
    Set<Vertex<T>> vertices = adjacencyLists.keySet();
    for (Vertex<T> vertex : vertices)
    {
      List<Edge<T>> adjacencyList = adjacencyLists.get(vertex);
      graphString.append(vertex.value.toString()).append(": ");
      for(Edge<T> edge : adjacencyList)
      {
        graphString.append(edge.destination.value).append("(weight ").append(edge.weight).append(") -> ");
      }
      graphString.append("null\n");
    }
    return graphString.toString();
  }
}

