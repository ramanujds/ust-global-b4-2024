let names = ['Rose','Sandra','Shreya'];

let trainees = [];

names.push('Suhas')

let trainee1 = {
    id:1,
    name:'Sandra',
    location:'Kerala'
};

// for(let name of names){
//     console.log(name);
    
// }

// names.pop()

names.splice(1,1)

names.forEach(name => console.log(name))
