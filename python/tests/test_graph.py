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

