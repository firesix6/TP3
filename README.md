Exo1:
-----
On a deux classe:
-> UserService: qui recuppere un objet utilsiateur en utilsiant son ID,
-> User: c'est la classe qui defini l'utilisateur avec id et nom simplement, pour pouvoir faire la simulaiton apres
on a aussi une interface: 
-> UserRepository: qui contient une seule methode findUserById, qui serra apl par la classe UserService pour recupere l'utilisateur.
4-Dans cette exercice on veut verifier la methode de l'interface, pour cella on a:
  1- on definis l'utilisateur (avec son id et nom)
  2- on definis le comportement du mock
  3- on defiri le resultat qui est supposé etre
  4- on fait les verification 