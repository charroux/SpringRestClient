# SpringRestClient

Cr�� par programmation une requ�te HTTP GET � destination d'un web service rest.

T�l�chager le projet

D�compresser

gradle build

gradle eclipse

importer le projet sous Eclipse

Editer le fichier main et adapter l'instruction suivante � votre projet :

Integer j = template.getForObject("http://localhost:8080/webServiceUrl", Integer.class);

Ici, c'est le cas o� le web service retourne un entier.