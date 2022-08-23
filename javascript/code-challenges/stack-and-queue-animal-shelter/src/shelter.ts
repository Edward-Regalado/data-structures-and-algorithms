interface Animal {
  name: string;
  type: "cat" | "dog";
}

export class Shelter {
  container: Animal[] = [];


  enqueue(name: string, type: "cat" | "dog"): void {
    const newAnimal: Animal = {
      name: name,
      type: type
    };
    // adds a new animal to the beginning of the array @ index[0]
    this.container.push(newAnimal);
  }

  dequeue(type?: "cat" | "dog"): string {
    let adoptedAnimal: any;
    // check if animal array is empty
    if(this.isEmpty()) {
      throw new Error("There are no Animals available");
    }
    // check if no preference was specified, simply return the last index in array
    if(type === undefined){
      adoptedAnimal = this.container.shift()?.name.toString();
      return adoptedAnimal;
    } else {
      // for(let i = this.container.length - 1; i >= 0; i--) {
      //   this.container.forEach((animal, index) => {
      //     if(animal.type === type){
      //       console.log('animal type is,', animal.type);
      //       this.container.splice(index, 1)[0].name;
      //       adoptedAnimal = animal.name;
      //   };
      // });
      for(let i = 0; i >= this.container.length - 1; i++) {
        // let animal: string | undefined;
        console.log(`for loop iteration: ${this.container[i].toString()}`);
        if(this.container[i].type === type) {
          this.container.slice(i, i + 1);
          adoptedAnimal = this.container[i].name;
          console.log(`adoptedAnimal: ${adoptedAnimal}`);

        }
      }
    }
    return adoptedAnimal;
  }

  isEmpty(): boolean {
      if(this.container.length === 0){
        return true;
      } else {
        return false;
      }
  };
}
