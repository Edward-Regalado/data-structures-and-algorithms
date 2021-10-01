# Implementation: Graphs

## Code Challenge: Class 35

## Specifications

- Read all of these instructions carefully.
- Name things exactly as described.
- Do all your work in a your data-structures-and-algorithms public repository.
- Create a new branch in your repo named as noted below.
- Follow the language-specific instructions for the challenge type listed below.
- Update the “Table of Contents” - in the README at the root of the repository - with a link to this challenge’s README file.

### Challenge Setup & Execution

Branch Name: graph

Challenge Type: New Implementation

## Features

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

- add node
    - Arguments: value
    - Returns: The added node
    - Add a node to the graph

- add edge
    - Arguments: 2 nodes to be connected by the edge, weight (optional)
    - Returns: nothing
    - Adds a new edge between two nodes in the graph
    - If specified, assign a weight to the edge
    - Both nodes should already be in the Graph

- get nodes
    - Arguments: none
    - Returns all of the nodes in the graph as a collection (set, list, or similar)

- get neighbors
    - Arguments: node
    - Returns a collection of edges connected to the given node
    - Include the weight of the connection in the returned collection

- size
    - Arguments: none
    - Returns the total number of nodes in the graph

### Structure and Testing

Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write tests to prove the following functionality:

1. Node can be successfully added to the graph
2. An edge can be successfully added to the graph
3. A collection of all nodes can be properly retrieved from the graph
4. All appropriate neighbors can be retrieved from the graph
5. Neighbors are returned with the weight between nodes included
6. The proper size is returned, representing the number of nodes in the graph
7. A graph with only one node and edge can be properly returned
8. An empty graph properly returns null

Ensure your tests are passing before you submit your solution.

## Code Challenge: Class 36

Implement a breadth-frist traversal on a graph

### Challenge Setup & Execution

Branch Name: graph-breadth-first

Challenge Type: Extending an Implementation

## Feature Tasks

Write the following method for the Graph class:

- breadth first
- Arguments: Node
- Return: A collection of nodes in the order they were visited.
- Display the collection

## Structure and Testing

Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

# Code Challenge: Class 38

Conduct a depth first preorder traversal on a graph

## Specifications

- Read all of these instructions carefully.
- Name things exactly as described.
- Do all your work in a your data-structures-and-algorithms public repository.
- Create a new branch in your repo named as noted below.
- Follow the language-specific instructions for the challenge type listed below.
- Update the “Table of Contents” - in the README at the root of the repository - with a link to this challenge’s README file.

### Challenge Setup & Execution

Branch Name: graph-depth-first

Challenge Type: Extending an Implementation

## Feature Tasks

Write the following method for the Graph class:

- depth first
- Arguments: Node (Starting point of search)
- Return: A collection of nodes in their pre-order depth-first traversal order
- Display the collection

