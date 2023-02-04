import './App.css';
import {getAllStudents} from "./client";

function App() {
    getAllStudents().then(res => res.json()).then(console.log);
   return "hello friend"
}

export default App;
