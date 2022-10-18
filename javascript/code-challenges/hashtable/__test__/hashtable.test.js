const HashMap = require('../hashtable.js');

describe('HashMap', () => {
  it('instantiates a new hashMap of size 10', () => {
    const hm =  new HashMap(50);
    expect(hm).toBeDefined();
    expect(hm.size).toBe(50);
  });

  it('returns the size of our HashMap', () => {
    const hm =  new HashMap(50);
    expect(hm.size).toBe(50);
  });

  it('Setting a key/value to your HashMap results in the value being in the data structure', () => {
    const hm =  new HashMap(50);
    hm.set('Tony', 'Regalado');
    hm.set('Jim', 'Smith');
    hm.set('Frank', 'Cooley');
    
  });

  it('Retrieving based on a key returns the value stored', () => {
    const hm =  new HashMap(50);
    // expect(hm.size).toBe(10);
  });

  it('Successfully returns null for a key that does not exist in the HashMap', () => {
    const hm =  new HashMap(50);
    hm.set('Tony', 'Regalado');
    hm.set('Jim', 'Smith');
    hm.set('Frank', 'Cooley');
    expect(hm.get('Does Not Exist')).toBe(undefined);
  });

  it('Successfully returns a list of all unique keys that exist in the HashMap', () => {
    const hm =  new HashMap(50);
    // expect(hm.size).toBe(10);
  });

  it('Successfully handle a collision within the HashMap', () => {
    const hm =  new HashMap(50);
    // expect(hm.size).toBe(10);
  });

  it('Successfully retrieve a value from a bucket within the HashMap that has a collision', () => {
    const hm =  new HashMap(50);
    // expect(hm.size).toBe(10);
  });

  it('Successfully hash a key to an in-range value', () => {
    const hm =  new HashMap(10);
    let size = hm.size;
    expect(hm.hash('Tony')).toBeLessThanOrEqual(size);
    expect(hm.hash('Arthur')).toBeLessThanOrEqual(size);
  });






});
