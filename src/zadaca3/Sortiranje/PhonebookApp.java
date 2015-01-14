package zadaca3.Sortiranje;

	public class PhonebookApp  {
		 
		public static void main(String[] args) {
			Person[] phonebook = new Person[] {
		      new Person("Aja", "Goehring"),
					new Person("Arvilla", "Hodžiæ"),
					new Person("Lavette", "Viveiros"),
					new Person("Mandi", "Arguello"),
					new Person("Annett", "Mize"),
					new Person("Shantell", "Dike"),
					new Person("Daphine", "Dillman"),
					new Person("Louella", "Hodžiæ"),
					new Person("Amalia", "Brigman"),
					new Person("Alphonse", "Varley"),
					new Person("Phil", "Ewen"),
					new Person("Olimpia", "Saenz"),
					new Person("Erminia", "Mirando"),
					new Person("Edythe", "Castenada"),
					new Person("Robbi", "Maese"),
					new Person("Kelley", "Printz"),
					new Person("Dannie", "Ocasio"),
					new Person("Charles", "Hodžiæ"),
					new Person("Rubie", "Washer"),
					new Person("Bryant", "Masker"),
					new Person("Julius", "Stalzer"),
					new Person("Clement", "Prager"),
					new Person("Kathie", "Oquin"),
					new Person("Shakira", "Hernandes"),
					new Person("Armand", "Boler"),
					new Person("Foster", "Tims"),
					new Person("Hana", "Howson"),
					new Person("Arletta", "Nastasi"),
					new Person("Rebeca", "Mcnally"),
					new Person("Hsiu", "Rosemond"),
					new Person("Tyson", "Hodžiæ"),
					new Person("Celina", "Gallego"),
					new Person("Criselda", "Herrell"),
					new Person("Kendall", "Bascombe"),
					new Person("Nubia", "Deeter"),
					new Person("Joannie", "Deshields"),
					new Person("Sarai", "Criner"),
					new Person("Joette", "Anderson"),
					new Person("Alfonzo", "Rubinstein"),
					new Person("Justin", "Capshaw"),
					new Person("Elton", "Schnee"),
					new Person("Sage", "Sherrer"),
					new Person("Vita", "Neihoff"),
					new Person("Nikia", "Moody"),
					new Person("Linsey", "Profitt"),
					new Person("Tanesha", "Hodžiæ"),
					new Person("Billye", "Widman"),
					new Person("Kareem", "Whalley"),
			};
	 
			System.out.println("Sortirani po imenima");
			sortByFirstName(phonebook);
			printPhonebook(phonebook);
			System.out.println();
	 
			System.out.println("Sortirani po prezimenima");
			sortByLastNameIns(phonebook);
			sortByLastNameSel(phonebook);
			printPhonebook(phonebook);
			
			System.out.println("Compare first name: ");
			Comparator CompareFirstName;
			sortWithComparator(phonebook, CompareFirstName = new Comparator(){

				@Override
				public int compare(Person left, Person right) {
					int c =  left.getFirstName().compareTo(right.getFirstName());
					return c;
				}

			});
			printPhonebook(phonebook);
			
			System.out.println("\nCompare last name: ");
			Comparator CompareLastName;
			sortWithComparator(phonebook, CompareLastName = new Comparator(){

				@Override
				public int compare(Person left, Person right) {
					int c =  left.getLastName().compareTo(right.getLastName());
					return c;
				}

			});
			printPhonebook(phonebook);
			
			
		}
	 
		private static void sortWithComparator(Person[] phonebook,
				Comparator comparator) {
			for (int i = 1; i<phonebook.length; i++){
				Person temp = phonebook[i];
				int j=i;
				while (j>0 && comparator.compare(phonebook[j-1], temp) > 0){
					phonebook[j] = phonebook[j-1];
					j--;
				}
				phonebook[j] =temp;
			}
			
		}

		/**
		 * Method that sorts array of persons by First Name using insertion sort.
		 * @param array - array of Person that we want to sort.
		 */
		private static void sortByFirstName(Person[] array) {
			for ( int i=1; i<array.length; i++){
				Person min = array[i];
				int j = i;
				for ( j= i; j>0 && array[j-1].getFirstName().compareTo(min.getFirstName()) > 0; j--){
					array[j]=array[j-1];
				}
				array[j] = min;
			}
		}
	 
		/**
		 * Method that sorts array of persons by Last Name using insertion sort.
		 * @param array - array of Person that we want to sort.
		 */
		
		// insertion sort
		private static void sortByLastNameIns(Person[] array) {
			for ( int i=1; i<array.length; i++){
				Person min = array[i];
				int j = i;
				while( j>0 && array[j-1].getLastName().compareTo(min.getLastName()) > 0){
					array[j] = array [j-1];
					j--;
				}
				array[j] = min;
			}
			
		}
		
		// selection sort
		private static void sortByLastNameSel(Person[] array) {
			for ( int i=0; i<array.length; i++){
				int min = i;
				for ( int j = i+1; j<array.length; j++ ){
					if( array[j].getLastName().compareTo(array[min].getLastName())< 0){
						min = j;
					}
				}
				Person temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		
		
	 
		private static void printPhonebook(Person[] phonebook) {
			for (Person person : phonebook) {
				System.out.println(person);
			}
		}


	}
