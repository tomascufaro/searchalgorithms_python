package java_algorithms;
class Nodo {

    private int valor;
    private Nodo siguiente;
   
    public Nodo(){
    this.valor = 0;
    this.siguiente = null;
    }
   
    public int obtenerValor() {
    return valor;
    }
    public void setearValor(int valor) {
    this.valor = valor;
    }
    public Nodo obtenerSiguiente() {
    return siguiente;
    }
    public void setearSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
    }
   }
   class Lista {
   
    private Nodo inicio;
    private int longitud;
   
    public Lista(){
    inicio = null;
    longitud = 0;
    }
   
    public boolean esVacia(){
    return inicio == null;
    }
   
   
    public int obtenerLongitud(){
    return longitud;
    }
   
   
    public void agregarAlFinal(int valor){
   
    Nodo nuevo = new Nodo();
    nuevo.setearValor(valor);
   
    if (esVacia()) {
   
    inicio = nuevo;
    
    } else
    {
    Nodo aux = inicio;
    while(aux.obtenerSiguiente() != null){
    aux = aux.obtenerSiguiente();
    }
    aux.setearSiguiente(nuevo);
    }
   
    longitud++;
    }
   
   
    public void agregarAlInicio(int valor){
   
    Nodo nuevo = new Nodo();
    nuevo.setearValor(valor);
   
    if (esVacia()) {
   
    inicio = nuevo;
   
    } else
    {
    nuevo.setearSiguiente(inicio);
    inicio = nuevo;
    }
    longitud++;
    }
   
    public void insertarPorReferencia(int referencia, int valor){
   
    Nodo nuevo = new Nodo();
    nuevo.setearValor(valor);
   
    if (!esVacia()) {
   
    if (buscar(referencia)) {
   
    Nodo aux = inicio;
   
    while (aux.obtenerValor() != referencia) {
    aux = aux.obtenerSiguiente();
    }
    
    Nodo siguiente = aux.obtenerSiguiente();
   
    aux.setearSiguiente(nuevo);
    nuevo.setearSiguiente(siguiente);
   
    longitud++;
    }
    }
    }
   
    public void insertarPorPosicion(int posicion, int valor){
   
    if(posicion>=0 && posicion<=longitud){
    Nodo nuevo = new Nodo();
    nuevo.setearValor(valor);
   
    if(posicion == 0){
    nuevo.setearSiguiente(inicio);
    inicio = nuevo;
    }
    else{
   
    if(posicion == longitud){
    Nodo aux = inicio;
   
    while(aux.obtenerSiguiente() != null){
    aux = aux.obtenerSiguiente();
    }
   
    aux.setearSiguiente(nuevo);
    }
    else{
   
    Nodo aux = inicio;
   
    for (int i = 0; i < (posicion-1); i++) {
    aux = aux.obtenerSiguiente();
    }
   
    Nodo siguiente = aux.obtenerSiguiente();
    aux.setearSiguiente(nuevo);
    nuevo.setearSiguiente(siguiente);
    }
    }
    
    longitud++;
    }
    }
   
    public int obtenerValor(int posicion) throws Exception{
   
    if(posicion>=0 && posicion<longitud){
   
    if (posicion == 0) {
    return inicio.obtenerValor();
    }else{
    Nodo aux = inicio;
    for (int i = 0; i < posicion; i++) {
    aux = aux.obtenerSiguiente();
    }
    return aux.obtenerValor();
    }
   
    } else {
    throw new Exception("Posicion inexistente en la lista.");
    }
    }
   
    public boolean buscar(int referencia){
   
    Nodo aux = inicio;
    boolean encontrado = false;
    while(aux != null && encontrado != true){
   
    if (referencia == aux.obtenerValor()){
    encontrado = true;
    }
    else{
    aux = aux.obtenerSiguiente();
    }
    }
   
    return encontrado;
    }
   
    public int obtenerPosicion(int referencia) throws Exception{
   
    if (buscar(referencia)) {
   
    Nodo aux = inicio;
    int cont = 0;
   
    while(referencia != aux.obtenerValor()){
   
    aux = aux.obtenerSiguiente();
    cont ++;
    }
   
    return cont;
   
    } else {
    throw new Exception("Valor inexistente en la lista.");
    }
    }
   
    public void editarPorReferencia(int referencia, int valor){
   
    if (buscar(referencia)) {
   
    Nodo aux = inicio;
   
    while(aux.obtenerValor() != referencia){
    aux = aux.obtenerSiguiente();
    }
    aux.setearValor(valor);
    }
    }
   
    public void editarPorPosicion(int posicion , int valor){
   
    if(posicion>=0 && posicion<longitud){
   
    if(posicion == 0){
   
    inicio.setearValor(valor);
    }
    else{
    Nodo aux = inicio;
   
    for (int i = 0; i < posicion; i++) {
    aux = aux.obtenerSiguiente();
    }
   
    aux.setearValor(valor);
    }
    }
    }
   
    public void removerPorReferencia(int referencia){
   
    if (buscar(referencia)) {
   
    if (inicio.obtenerValor() == referencia) {
   
    inicio = inicio.obtenerSiguiente();
    } else{
   
    Nodo aux = inicio;
   
    while(aux.obtenerSiguiente().obtenerValor() != referencia){
    aux = aux.obtenerSiguiente();
    }
   
    Nodo siguiente = aux.obtenerSiguiente().obtenerSiguiente();
   
    aux.setearSiguiente(siguiente);
    }
    longitud--;
    }
    }
   
    public void removerPorPosicion(int posicion){
   
    if(posicion>=0 && posicion<longitud){
   
    if(posicion == 0){
   
    inicio = inicio.obtenerSiguiente();
    }
   
    else{
   
    Nodo aux = inicio;
    for (int i = 0; i < posicion-1; i++) {
    aux = aux.obtenerSiguiente();
    }
   
    Nodo siguiente = aux.obtenerSiguiente();
    aux.setearSiguiente(siguiente.obtenerSiguiente());
    }
    longitud--;
    }
    }
   
    public void eliminar(){
   
    inicio = null;
    longitud = 0;
    }
   
    public void listar(){
   
    if (!esVacia()) {
   
    Nodo aux = inicio;
    int i = 0;
   
    while(aux != null){
   
    System.out.print(i + ".[ " + aux.obtenerValor() + " ]" + " -> ");
    aux = aux.obtenerSiguiente();
    i++;
    }
    }
    }
   }

