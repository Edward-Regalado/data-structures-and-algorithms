from code_challenges.graph.graph import Graph, Vertex, Edge
import pytest

def test_instantiate_graph():
    g = Graph()
    assert g
    assert g._adjacency_list == {}

def test_instantiate_vert():
    v = Vertex()
    assert v
    assert v.value == None

def test_instantiate_edge():
    v = Vertex("I'm really a Node")
    e = Edge(v, weight=1)
    assert e.vertex == v
    assert e.weight == 1

def test_vertex_can_be_added_to_graph():
    graph = Graph()
    vertex1 = Vertex("hello")
    graph.add_node(vertex1)
    result = graph.size()
    assert result == 1


def test_edge_can_be_added_to_graph():
    graph = Graph()
    v1 = Vertex(1)
    v2 = Vertex(2)
    graph.add_node(v1)
    graph.add_node(v2)
    graph.add_edge(v1, v2)
    list = graph._adjacency_list[v1]
    edge = list[0]
    assert edge.vertex == v2
    

def test_all_nodes_can_be_retrieved_from_graph():
    pass

def test_neighbors_can_be_retrieved_from_grpah():
    pass

def test_neighbors_are_returned_with_weight():
    pass

def test_proper_size_of_nodes_is_returned():
    pass

def test_one_node_and_graph_can_be_returned():
    pass

def test_empty_graph_returns_null():
    pass



