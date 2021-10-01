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

def test_empty_graph():
    graph = Graph()
    assert graph

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
    graph.add_edge(v1, v2, 10)
    assert True


def test_all_nodes_can_be_retrieved_from_graph():
    graph = Graph()
    v1 = Vertex(1)
    v2 = Vertex(2)
    graph.add_node(v1)
    graph.add_node(v2)
    actual = graph.get_nodes()
    expected = [1, 2]
    for i, obj in enumerate(actual):
        assert obj.value == expected[i]

def test_neighbors_can_be_retrieved_from_graph():
    pass

def test_neighbors_are_returned_with_weights_between_nodes_included():
    graph = Graph()
    vertex1 = Vertex(1)
    vertex2 = Vertex(2)
    vertex3 = Vertex(3)
    graph.add_node(vertex1)
    graph.add_node(vertex2)
    graph.add_node(vertex3)
    graph.add_edge(vertex1, vertex2, 20)
    graph.add_edge(vertex1, vertex3, 30)
    actual = graph.get_neighbors(vertex1)
    edge1 = actual[0]
    edge2 = actual[1]
    assert edge1.vertex == vertex2
    assert edge1.weight == 20
    assert edge2.vertex == vertex3
    assert edge2.weight == 30

def test_neighbors_are_returned_with_weight():
    pass

def test_proper_size_of_nodes_is_returned():
    graph = Graph()
    v1 = Vertex(1)
    v2 = Vertex(2)
    graph.add_node(v1)
    graph.add_node(v2)
    actual = graph.size()
    assert actual == 2

def test_one_node_and_graph_can_be_returned():
    pass

def test_breadth_first():
    pass

def test_depth_first():
    pass
