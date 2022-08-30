'use strict';

// Require our linked list implementation
const LinkedList = require('../index');

describe('Linked List', () => {
  it('works', () => {
    const list = new LinkedList();
    expect(true).toBeTruthy();
    expect(list).toBeDefined();
  });
});
