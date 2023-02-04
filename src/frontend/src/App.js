import './App.css';
import {getAllStudents} from "./client";
import {useEffect, useState} from 'react';

function App() {
    const [students, setStudents] = useState([])

    const fetchStudents = () =>
        getAllStudents().then(res => res.json()).then(data => setStudents(data));


    useEffect(() => {
        console.log("component is mounted")
        fetchStudents();

    }, []);

    if (students.length <= 0) {
        return "No Data Found"
    }
    return students.map((student, index) => {
        return <p key={index}>{student.id} {student.name}</p>
    })
}

export default App;
