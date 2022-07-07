import React,{useRef} from 'react';
type NewTodoProps ={
    onAddTodo: (todoText:string) =>void
}
const NewTodo:React.FC<NewTodoProps> =(props)=>{
    const textInputRef = useRef<HTMLInputElement>(null)
    const todoSubmitHandler=(event:React.FormEvent)=>{
        event.preventDefault()
        const enterText= textInputRef.current!.value
        props.onAddTodo(enterText)
    }
    return(
        <form onSubmit={todoSubmitHandler}>
            <label className="relative block p-3 border-2 border-gray-200 rounded-lg" htmlFor="name">
            <input
            className="w-full px-0 pt-3.5 pb-0 text-sm placeholder-transparent border-none focus:ring-0 peer"
            id="todo-text"
            type="text"
            placeholder="Name"
            ref={textInputRef}
              />

            <span className="absolute text-xs font-medium text-gray-500 transition-all left-3 peer-focus:text-xs peer-focus:top-3 peer-focus:translate-y-0 peer-placeholder-shown:top-1/2 peer-placeholder-shown:-translate-y-1/2 peer-placeholder-shown:text-sm">
            Add Todos
            </span>
                <button className="absolute p-2 text-white -translate-y-1/2 bg-blue-600 rounded-full top-1/2 right-4" type="submit">
                    <svg className="w-4 h-4" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 6v6m0 0v6m0-6h6m-6 0H6" />
                    </svg>
                </button>
            </label>
        </form>
    )
}
export default NewTodo