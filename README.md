# Story Pitch Management System (SPMS)

# Project Description
The purpose of the Story Pitch Management System is to provide an organized pipeline for story pitches so that more new and creative stories can be given the opportunity to be published. This system ensures that no pitch will be overlooked, authors can only have a reasonable amount of active story pitches, authors can submit drafts for pitches that have been approved, work is assigned to editors based on their workload and genre, and that senior editors can make certain changes to a pitch.

To ensure that authors only have a reasonable amount of active story pitches, a points sytem is put in place. Each author begins with 100 points. An author can spend their points on submitting pitches to the system. Novels are worth 50 points, novellas 25 points, short stories 20 points, and articles 10 points. If an author submits a pitch with an insufficient amount of points, their pitch is placed on hold. When a pitch reaches final approval, the author can submit a draft. Once the draft is approved, the amount of points that the author spent on submitting the pitch for the draft will be allotted back to the them.

This system assigns pitches to editors based on their workload, which genre committee they work in, and their status in that committee. The system assumes that an editor can work in multiple genre committees and can be an assistant in one committee and a senior in another. The five stages of a pitch are assistant editor, general editor, senior editor, canceled, and rejected. The process is as follows: first, a pitch is assigned to an assistant editor in the relevant genre committee. Once approved, the pitch is then assigned to an editor that is not in the relevant genre committee. This editor can be an assistant or senior in their genre committee, but for the pitch they are considered to be a general editor. Once approved, the pitch is finally assigned to a senior editor in the relevant genre committee. An assistant, general, or senior editor can reject a pitch. An author can choose to cancel their pitch instead of submitting a draft. As senior editor can choose to update pitch's title, tagline, or tentative completion date.

When assigning a pitch, the number of pitches for every eligible editor is compared. The system assigns the pitch to the editor with the least amount of pitches.

Assistant and general editors must work on pitches that are labeled a high priority. They cannot approve pitches with low priority if there are high priority pitches on their dashboard. This excludes any pitches that they are a senior editor on.

The draft approval process depends on which story type the draft falls under. Novels and novellas need to be approved by a majority of editors in the relevant genre committee to reach final approval. Short stories need to be approved by a senior editor and at least one other editor from in the relevant genre committe. Articles only need to be approved by the senior editor in the relevant genre committee. 


# Technologies Used
<ul>
  <li>Apache Tomcat - version 9</li>
  <li>AWS Relation Database System</li>
  <li>Hibernate - version 5.2.12</li>
  <li>Java - version 8</li>
  <li>Javascript</li>
  <li>JUnit - version 5</li>
</ul>


# Features
<ul>
  <li>Author/Editor Login</li>
  <li>Author Dashboard/Editor Dashboard</li>
  <li>Pitch Creation</li>
  <li>Pitch Approval Process</li>
  <li>Draft Submission</li>
  <li>Draft Approval Process</li>
</ul>

To-Do:
<ul>
  <li>Implement messaging system</li>
  <li>Allow editors to request additonal details before approving a pitch</li>
  <li>Allow editors to request a change to a draft</li>
  <li>Calculate pitch priority based on elapsed time and completion date</li>
</ul>

# Getting Started
Install Apache Tomcat version 9 or greater

![Screen Shot 2021-03-24 at 10 57 42 AM](https://user-images.githubusercontent.com/36642973/112345968-8686e280-8c93-11eb-9eac-3fd60c6e3adc.png)

Run the project on http://localhost:8080/SPMS/static/index.html

![Screen Shot 2021-03-24 at 10 59 04 AM](https://user-images.githubusercontent.com/36642973/112347062-8f2be880-8c94-11eb-93f1-2b3cb4684d94.png)


# Usage
To view the author or editor dashboards, use any of the following logins:

Authors:
<table>
  <tr>
    <th>Username</th>
    <th>Password</th>
  </tr>
  <tr>
    <td>bailey</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>derrick</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>fiona</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>lauren</td>
    <td>pass</td>
  </tr>
    <tr>
    <td>michael</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>tyler</td>
    <td>pass</td>
  </tr>
</table>

Editors:
<table>
  <tr>
    <th>Username</th>
    <th>Password</th>
  </tr>
  <tr>
    <td>brianna</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>daniel</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>elizabeth</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>gabriel</td>
    <td>pass</td>
  </tr>
    <tr>
    <td>kate</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>matthew</td>
    <td>pass</td>
  </tr>
  <tr>
    <td>samantha</td>
    <td>pass</td>
  </tr>
</table>

The genre committees are:
<table>
  <tr>
    <th>Genre</th>
    <th>Editor</th>
    <th>Status</th>
  </tr>
  <tr>
    <td>adventure</td>
    <td>daniel</td>
    <td>senior</td>
  </tr>
  <tr>
    <td></td>
    <td>samantha</td>
    <td>senior</td>
  </tr>
  <tr>
    <td></td>
    <td>thomas</td>
    <td>assistant</td>
  </tr>
  <tr>
    <td>horror</td>
    <td>matthew</td>
    <td>senior</td>
  </tr>
  <tr>
    <td></td>
    <td>elizabeth</td>
    <td>assistant</td>
  </tr>
  <tr>
    <td></td>
    <td>thomas</td>
    <td>assistant</td>
  </tr>
  <tr>
    <td>non-fiction</td>
    <td>kate</td>
    <td>senior</td>
  </tr>
  <tr>
    <td></td>
    <td>gabriel</td>
    <td>assistant</td>
  </tr>
  <tr>
    <td>romance</td>
    <td>brianna</td>
    <td>senior</td>
  </tr>
  <tr>
    <td>sci-fi</td>
    <td>gabriel</td>
    <td>senior</td>
  </tr>
  <tr>
    <td></td>
    <td>elizabeth</td>
    <td>assistant</td>
  </tr>
  <tr>
    <td></td>
    <td>thomas</td>
    <td>assistant</td>
  </tr>
</table>


