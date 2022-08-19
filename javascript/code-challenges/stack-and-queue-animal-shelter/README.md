# Stack-Queue Animal Shelter

- Create a class called `AnimalShelter` that holds dogs and cats objects
- Shelter operates on the FIFO (first-in, first-out)

## Methods

### enqueue

- Arguments: `animal` can be either a dog or a cat object

### dequeue

- Arguments: pref
  - `pref` can be either "dog" or "cat"
- Return: either a dog or a cat based on preference
  - if `pref` is not "dog" or "cat" then return null

## Approach & Efficiency

- `.enqueue(animal)`
  - Time: O(1)
  - Space: O(1)

- `.dequeue(pref)`
  - Time: O(n)
  - Space: O(1)

## API

- `.enqueue(animal)`
  - inserts a new element at the end of the queue

- `.dequeue(pref)`
  - removes the element at index 0 and shifts all other elements down one index

### Whiteboard

![Animal Shelter]()


