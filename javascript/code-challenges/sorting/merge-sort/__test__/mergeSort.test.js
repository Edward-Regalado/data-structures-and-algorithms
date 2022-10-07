const mergeSort = require('../mergeSort.js');

describe('merge sort', () => {
  it('throws an error is input array is empty', () => {
    const arr =  [];

    expect(() => mergeSort(arr)).toThrow('Input array is empty!');
  });

  it('sorts an array of random numbers', () => {
    const arr =  [5, 1, 10, 6, 15, 7];

    expect(mergeSort(arr)).toEqual([1, 5, 6, 7, 10, 15]);
  });

  it('sorts an array with a single value', () => {
    const arr =  [1];

    expect(mergeSort(arr)).toEqual([1]);
  });

  it('sorts an array with multiple values, including a zero', () => {
    const arr =  [20, 1, 0, 10, 5, ];

    expect(mergeSort(arr)).toEqual([0, 1, 5, 10, 20]);
  });

  it('sorts an array with repeating values', () => {
    const arr =  [5, 5, 5, 5, 5];

    expect(mergeSort(arr)).toEqual([5, 5, 5, 5, 5]);
  });

  it('sorts an array with negative and positive values', () => {
    const arr =  [-5, 1, -10, 6, 15, 7];

    expect(mergeSort(arr)).toEqual([-10, -5, 1, 6, 7, 15]);
  });

  it('sorts an array with all negative values', () => {
    const arr =  [-5, -1, -10, -6, -15, -7];

    expect(mergeSort(arr)).toEqual([-15, -10, -7, -6, -5, -1]);
  });


});
