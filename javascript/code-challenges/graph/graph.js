const Edge = require('./edge');

class Graph {
  constructor(){
    this.adjacencyList = new Map();
  }

  addNode(node){
    this.adjacencyList.set(node.value, []);
    return node;
  }

  addEdge(start, end = undefined, weight = 0) {
    const neighbors = this.adjacencyList.get(start.value);
    if(end === undefined){
      neighbors.push(new Edge());
      return start.value;
    } else {
      neighbors.push(new Edge(end.value, weight)); // push node object to the array
    }
  }

  getNodes() {
    const nodes = [];
    for(const key of this.adjacencyList.keys()){
      nodes.push(key);
    }
    return nodes;
  }

  getNeighbors(node) {
    return this.adjacencyList.get(node.value);
  }

  size(){
    return this.adjacencyList.size;
  }
}

module.exports = Graph;
