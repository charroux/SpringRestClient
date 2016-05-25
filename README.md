# SpringRestClient

Créé par programmation une requête HTTP GET à destination d'un web service rest.

Téléchager le projet

Décompresser

gradle build

gradle eclipse

importer le projet sous Eclipse

Editer le fichier main et adapter l'instruction suivante à votre projet :

Integer j = template.getForObject("http://localhost:8080/webServiceUrl", Integer.class);

Ici, c'est le cas où le web service retourne un entier.