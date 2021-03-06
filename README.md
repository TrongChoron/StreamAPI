<h1 align="center">StreamAPI</h1>

<h3>One of the major new features in Java 8 is the introduction of the stream functionality – java.util.stream – which contains classes for processing sequences of elements.

The central API class is the Stream<T>. The following section will demonstrate how streams can be created using the existing data-provider sources.</h3>

<h2>Stream Creation:</h2>

<h3>Streams can be created from different element sources e.g. collection or array with the help of stream() and of() methods:</h3>

```java
String[] arr = new String[]{"a", "b", "c"};
Stream<String> stream = Arrays.stream(arr);
stream = Stream.of("a", "b", "c");
```

<h2>Stream Operations</h2>

<h3>Filtering</h3>

<p>The filter() method allows us to pick a stream of elements that satisfy a predicate.</p>
<p>For example, consider the following list:</p>

```java
 StreamAPI streamAPI = new StreamAPI();
        streamAPI.listStudents.add(new Student(1,"Trong",true,21));
        streamAPI.listStudents.add(new Student(2,"Nha",true,18));
        streamAPI.listStudents.add(new Student(3,"Duc",true,16));
        streamAPI.listStudents.add(new Student(4,"Nam",false,20));
        streamAPI.listStudents.add(new Student(5,"Vinh",true,21));
        streamAPI.listStudents.add(new Student(6,"Tam",true,21));
        streamAPI.listStudents.add(new Student(7,"Huy",true,21));
        streamAPI.listStudents.add(new Student(8,"Khang",true,22));
        streamAPI.listStudents.add(new Student(9,"Uyen",false,25));
        streamAPI.listStudents.add(new Student(10,"Thanh",false,29));
```

<p>The following code creates to find all elements with gender is Male:</p>

```java
 streamAPI.listStudents
            .stream()
            .filter(student -> StreamAPI.convertGender(student.isGender()).equals("Male"))
            .collect(Collectors.toList());
```

<h3>Mapping</h3>

<p>To convert elements of a Stream by applying a special function to them and to collect these new elements into a Stream, we can use the map() method:</p>
<p>The following code is example:</p>

```java
 streamAPI.listStudentDTOs =
                streamAPI.listStudents
                        .stream()
                        .map(student -> new StudentDTO(student.getId(),student.getName(),student.isGender(), student.getAge()))
                        .collect(Collectors.toList());
```

<h3>Collection</h3>
<p>The reduction can also be provided by the collect() method of type Stream. This operation is very handy in case of converting a stream to a Collection or a Map and representing a stream in the form of a single string.</p>

```java
treamAPI.studentList
            .stream()
            .filter(student -> StreamAPI.convertGender(student.isGender()).equals("Male"))
            .collect(Collectors.toList());
```