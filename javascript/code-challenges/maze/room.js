class Room {
  constructor(name, gold = false, key = false){
    this.name = name;
    this.gold = gold;
    this.key = key;
  }
}

module.exports = Room;
