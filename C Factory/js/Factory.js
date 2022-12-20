function  Developer(name) {
    this.name=name
    this.type="Developer"
}

function Tester(name) {
    this.name=name
    this.type="Tester"
}

function EmployeeFactory() {
    this.create=(name,type)=>{
        switch (type) {
            case 1:
                return new Developer(name);                
            case 2:
                return new Tester(name);                
            default:
                break;
        }
    }
}

function say() {
    console.log("Hi, I am"+this.name+",and  I am"+this.type);
}

const employeeFactory=new EmployeeFactory()
const employees=[]

employees.push(employeeFactory.create("Patrik",1))
employees.push(employeeFactory.create("Bob",2))

employees.forEach(map=>{
    say.call(emp)
})