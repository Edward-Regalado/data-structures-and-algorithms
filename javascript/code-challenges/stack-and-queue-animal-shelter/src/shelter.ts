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
    this.container.push(newAnimal);
  }

  dequeue(type?: "cat" | "dog"): string | undefined{
    if(this.isEmpty) {
      throw new Error("No items in the container");
    } else {
      if(!this.isEmpty) {
        for(let i = 0; i < this.container.length; i++) {
            return this.container.splice(i, 1)[0].name;
        }
      }
    }
  if(type === undefined){
    return this.container.shift()?.name;
  }
}

  get isEmpty(): boolean {
    if(this.container.length === 0){
      return true;
    } else {
      return false;
    }
  };

};
