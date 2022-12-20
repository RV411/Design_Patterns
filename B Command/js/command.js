/**
 * ? an object is used to encapsulate 
 * ? all information needed to perform an action 
 * ? or trigger an event at a later time
 */


//* calc.execute(New AddCommand(19));
//* calc.getCurrentValue();
//* calc.execute(New AddCommand(1));
//* calc.getCurrentValue();
//* calc.undo();
//* calc.getCurrentValue();

function Calculator() {
    this._currentValue=0;
    this.commands=[];
}

Calculator.prototype={
    execute:function (command) {
        this._curretValue=command.execute(this._curretValue);
        this.commands.push(command);
    },
    undo:function () {
        var cmd=this.commands.pop();
        this._currentValue=cmd.undo(this._currentValue);
    },
    getCurrentValue:function () {
        return this._curretValue
    }
}

function add(value) {
    return value+this.value;
}

function sub(value) {
    return value-this.value;
}

function Command(fn,undo,value) {
    this.execute=fn;
    this.value=value;
    this.undo=undo;
}

function AddCommand(value) {
    Command.call(this,add,sub, value);
}

function SubCommand(value) {
    Command.call(this,sub,add, value);
}

var calc=new Calculator();