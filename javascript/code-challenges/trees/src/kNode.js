class KNode {
  constructor(value, children = []) {
    this.value = value;
    this.children = children;
  }
  // constructor(value) {
  //   this.value = value;
  //   this.children = [];
  // }

  addChild(child) {
    this.children.push(child);
  }
}

module.exports = KNode;
