import React,{useState} from 'react';
import './App.css';
import Todolist from './components/Todolist/Todolist'
import NewTodo from './components/Todolist/TodoSubmitHandler'
import {Todo} from "./components/Todolist/todo.model"

const App: React.FC = () => {
 
  const [todos, setTodos] = useState<Todo[]>([])


  const todoAddHandler = (text: string) => {
    setTodos(prevTodos => [...prevTodos, { id: Math.random().toString(), text: text }])
  }

  const todoDeleteHandler = (todoId: string) => {
    setTodos(prevTodos => {
      return prevTodos.filter(todo => todo.id !== todoId)
    })
  }

  return (
    <>
    <body>
      <header>
      wow
      </header>
      <div>
        <NewTodo onAddTodo={todoAddHandler} />
        <Todolist todos={todos} onDeleteTodo={todoDeleteHandler} />
      </div>
      <footer>
      finish
      </footer>
    </body>
    </>
  )
}

export default App