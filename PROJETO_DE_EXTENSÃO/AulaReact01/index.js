/*var container = document.getElementById('root'); 
var titulo = document.createElement('h1'); 
titulo.innerHTML = 'Título inserido por JavaScript :O'; 
container.appendChild(titulo);*/




/*var container = document.getElementById('root'); 
function Titulo() { 
    return ( <h1>Título inserido por JSX :D</h1> ) 
} 
ReactDOM.render(<Titulo />, container); */
// ReactDOM.createRoot(container).render(<Titulo />) versão antiga 




/*var container = document.getElementById('root'); 
function Titulo() { 
    return ( <React.Fragment> <h1>Esse título foi feito em react através do JSX: p</h1> 
                              <h1>Esta segunda tag foi feita dentro do JSX :P</h1> </React.Fragment> ) 
    } 
ReactDOM.createRoot(container).render(<Titulo />);*/




/*var container = document.getElementById("root"); 
function Titulo() { 
    return ( <React.Fragment> <h1>Esse título foi feito em react através do JSX :p</h1> 
                              <h1>Esta segunda tag foi feita dentro do JSX :P</h1> 
             </React.Fragment> ); 
}
function Titulos() { 
    return ( <div> <Titulo /> <Titulo /> <Titulo /> </div> ); 
} 
ReactDOM.createRoot(container).render(<Titulos />);*/




/*var container = document.getElementById("root"); 
function Titulo(props) { 
    return ( <React.Fragment> 
        {1<3 ? "braian" : props}
        <h1>{props.titulo || "se não passa titulo retorna vazio"}</h1> 
        <h2>{props.descricao}</h2> </React.Fragment> ); 
} 
                        
function Titulos() { 
    return ( <> <Titulo descricao="Descrição TOP" /> 
                <Titulo titulo="Titulo legal legal" descricao="Descrição TOP TOP" /> 
                <Titulo titulo="Titulo legal legal legal" descricao="Descrição TOP TOP TOP" /> </> ); 
            }  
ReactDOM.createRoot(container).render(<Titulos />);*/




var container = document.getElementById("root"); 
function Participante(props) {
    const [numero, setNumero] = React.useState(0); 
        function votar() { setNumero(numero + 1); }  
            return ( <> <div> <h2>{props.nome}</h2> 
                            <h3>{numero}</h3> 
                            <button onClick={votar}>Votar</button> 
                        </div> </> ); 
}  
    function Votacao() { 
        return ( <> <h1>Participantes</h1> <Participante nome="Blue Pen" /> 
                       <Participante nome="Blue Red" /> 
                       <Participante nome="Blue Orange" /> </> )
    }  
ReactDOM.createRoot(container).render(<Votacao />);




/*var container = document.getElementById("root"); 
function BotaoContador() {const [contador, setContador] = React.useState(0);       
    return (<div> <p>Você clicou {contador} vezes</p> 
            <button onClick={() => setContador(contador + 1)}>  Clique aqui </button>
            </div>     );   
}
ReactDOM.createRoot(container).render(<BotaoContador/>)*/



