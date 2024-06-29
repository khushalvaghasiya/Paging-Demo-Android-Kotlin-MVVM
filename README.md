Assignment: Implementing Paging 3 with Data Grouping for Android UI Display Using Coroutines*

*Objective:*
The objective of this assignment is to familiarize yourself with the implementation of Paging 3 library
in Android, along with grouping data fetched from a remote data source using coroutines to manage
asynchronous operations, and display it efficiently on the user interface.

*Requirements:*
1. Android Studio IDE (latest version recommended)
2. Basic understanding of Kotlin programming language and Android development.
3. Familiarity with RecyclerView, LiveData, and coroutines in Android.
4. Access to a remote data source with paginated data.

*Task:*
Your task is to create an Android application that fetches paginated data from a remote API using
Paging 3 library, uses coroutines to handle asynchronous operations, and groups the fetched data
for efficient display on the UI. Follow the steps below to accomplish the task:

*Step 1: Set up your Android Project*
- Create a new Android project in Android Studio.
- Add the necessary dependencies for Paging 3 library and coroutines in your build.gradle file.

*Step 2: Implement the Data Source*
- Create a data source class that fetches data from a remote API using Retrofit or any other
networking library.
- Implement a PagingSource class to load data in pages from your data source.

*Step 3: Configure Paging 3 with Coroutines*
- Set up a PagingConfig specifying page size, prefetch distance, and initial load size hints.
- Use coroutines to handle asynchronous operations for loading data from the PagingSource.

*Step 4: Grouping Data*
- Implement a method to group the fetched data based on a specific criterion (e.g., date, category,
etc.).
- You can use Kotlin's groupBy function for grouping.

*Step 5: UI Implementation*
- Create a RecyclerView to display the grouped data.
- Implement an adapter to bind the grouped data to the RecyclerView.
- Update the UI based on the grouped data as the user scrolls through the list.

*Step 6: Testing and Refinement*
- Test your application to ensure that data is loaded correctly and displayed in the UI.
- Refactor your code for any improvements or optimizations.

*Deliverables:*
1. Android project containing the implemented features.
2. Documented code with comments explaining key implementation details, especially regarding
coroutines usage.
3. A brief report summarizing the implementation process, challenges faced, and lessons learned.

*Submission Guidelines:*
- Zip your Android project along with the report.
- Submit the zip file through the designated platform or email.

*Note:*
- Ensure that your code follows best practices for Android development.
- Make appropriate use of coroutines for handling asynchronous operations.
- Handle errors gracefully, displaying appropriate messages to the user.
