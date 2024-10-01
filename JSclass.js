class Person {
    constructor(name, age, occupation, major) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.major = major;
    }
}
const person = new Person("Lovella", "20", "Student", "Programming");
        console.log("Name: " + person.name);
        console.log("Age: " + person.age);
        console.log("Name: " + person.occupation);
        console.log("Name: " + person.major);
document.getElementById("output").innerHTML = ` Name: ${person.name}<br>
                                                Age: ${person.age}<br>
                                                Occupation: ${person.occupation}<br>
                                                Major: ${person.major}<br>
`;