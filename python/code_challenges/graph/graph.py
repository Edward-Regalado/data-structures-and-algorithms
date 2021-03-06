from code_challenges.stack_and_queue.stack import Queue

class Graph:
    def __init__(self):
        # stores all of the verts inside graph
        self._adjacency_list = {}

    def add_node(self, node):
        '''
        add node
        Args: value
        Returns: the added node
        Add a node to the graph
        '''
        self._adjacency_list[node] = []
        return node

    def add_edge(self, start_vertex, end_vertex, weight=0):
        '''
        Arguments: 2 nodes to be connected by the edge, weight (optional)
        Returns: nothing
        Adds a new edge between two nodes in the graph
        If specified, assign a weight to the edge
        Both nodes should already be in the Graph
        '''
        if start_vertex not in self._adjacency_list:
            raise KeyError('Starting Vertex not in Graph')
        if end_vertex not in self._adjacency_list:
            raise KeyError('End Vertex not in Graph')

        edge = Edge(end_vertex, weight)
        adjancencies = self._adjacency_list[start_vertex]
        adjancencies.append(edge)


    def get_nodes(self):
        '''
        Arguments: none
        Returns all of the nodes in the graph as a collection (set, list, or similar)
        '''
        return self._adjacency_list.keys()

    def get_neighbors(self, vertex):
        '''
        Arguments: node
        Returns a collection of edges connected to the given node
        Include the weight of the connection in the returned collection
        '''
        return self._adjacency_list[vertex]


    def size(self):
        '''
        Arguments: none
        Returns the total number of nodes in the graph
        '''
        return len(self._adjacency_list)


    def breadth_first(self, vertex):
        '''
        Arguments: Node
        Return: A collection of nodes in the order they were visited.
        Display the collection
        '''
        nodes = []
        queue = Queue()
        visited = set()

        queue.enqueue(vertex)
        visited.add(vertex.value)

        while len(queue) > 0:
            front = queue.dequeue(0)
            neighbors = self.get_neighbors(front)
            nodes.append(front)

            for neighbor in neighbors:
                if neighbor[0].value not in visited:
                    visited.add(neighbor[0].value)
                    queue.enqueue(neighbor[0])

        return nodes

class Vertex:
    def __init__(self, value=None):
        self.value = value


class Edge:
    def __init__(self, vertex, weight=0):
        self.vertex = vertex
        self.weight = weight



