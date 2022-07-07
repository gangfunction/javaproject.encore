import React from "react";

interface TodoListProps {
    todos: { id: string, text: string }[]
    onDeleteTodo: (id: string) => void
}
const Todolist: React.FC<TodoListProps> = (props) => {

    return <ul>
        <nav className="flex flex-col space-y-1">
            <a href=""className="block px-4 py-2 text-sm font-medium text-gray-500 rounded-lg hover:bg-gray-100 hover:text-gray-700">
                {props.todos.map((todo) => <li key={todo.id}>
                <>{todo.text}</>
                </li>)}
            </a>
        </nav>
        <nav>
        {props.todos.map((todo) => <li key={todo.id}>
                <button onClick={props.onDeleteTodo.bind(null, todo.id)}>Delete</button>
                </li>)}
        </nav>
    </ul>
}
export default Todolist;