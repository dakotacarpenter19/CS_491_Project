# <p align="right">Project Management Plan</br><br>for<br></br>Checkers</p>


### <p align="right">Version 1.0 draft 1<br></br>Prepared by Dakota Carpenter and Austin Winters<br></br>WIU CS 492 Software Engineering II<br></br>2.19.23</div>

## Table of Contents

<ul style="list-style-type:none">
	<li><strong>1. Overview</strong>
		<ul style="list-style-type:none">
			<li>1.1. Project Purpose, Objectives, and Success Criteria</li>
			<li>1.2. Project Deliverables</li>
			<li>1.3. References</li>
			<li>1.4. Evolution of the Plan</li>
		</ul>
	</li>
	<li><strong>2. Project Organization</strong>
		<ul style="list-style-type:none">
			<li>2.1. External Interfaces</li>
			<li>2.2. Internal Structure</li>
			<li>2.3. Roles and Responsibilities</li>
		</ul>
	</li>
	<li><strong>3. Managerial Process Plans</strong>
		<ul style="list-style-type:none">
			<li>3.1. Start-Up Plans
				<ul style="list-style-type:none">
					<li>3.1.1 Estimation Plan</li>
					<li>3.1.2 Staffing Plan</li>
					<li>3.1.3 Resource Acquisition Plan</li>
				</ul>
			</li>
			<li>3.2. Work Plan</li>
			<li>3.3. Control Plan
				<ul style="list-style-type:none">
					<li>3.3.1 Data Control Plan</li>
					<li>3.3.2 Requirements Control Plan</li>
					<li>3.3.3 Schedule Control Plan</li>
					<li>3.3.5 Communication, Tracking, and Reporting Plan</li>
				</ul>
			</li>
			<li>3.4. Issue Resolution Plan</li>
		</ul>
	</li>
	<li><strong>4. Technical Process Plans</strong>
		<ul style="list-style-type:none">
			<li>4.1. Process Model</li>
			<li>4.2. Methods, Tools, and Techniques</li>
			<li>4.3. Configuration Management Plan</li>
			<li>4.4. Quality Assurance Plan</li>
			<li>4.5. Documentation Plan</li>
			<li>4.6. Process Improvement Plan</li>
		</ul>
	</li>
</ul>

## 1. Overview

### 1.1. Project Purpose, Objectives, and Success Criteria
This Project Management Plan is intended to demonstrate the (partial or whole) utter outline of the computer-based game project Checkers, including but not limited to game mechanics, user interface, and user experience. The Project Management Plan list includes all characteristics Checkers will have and others that are crucial to the software.

### 1.2. Project Deliverables
Deliverable: Checkers V1.0 Recipient: Professor Glaue Delivery Date: 3/31/23 Delivery Method: Online distribution

### 1.3. References
Checkers Instructions: https://en.wikipedia.org/wiki/Checkers#General_rules

### 1.4. Evolution of the Plan
The evolution of this plan will occur if any unforeseen requirements come up in the development cycle. This information will be provided to everyone in the project through scheduled project reviews.

## 2. Project Organization

### 2.1. External Interfaces
Users of the software can contact us via our email addresses for questions.

### 2.2. Internal Structure
Dakota and Austin are both owners of the software. Currently, we do not have specifically defined roles other than project manager which will be defined in the next section.

### 2.3. Roles and Responsibilities
Project Manager (Phase 1) - Dakota Carpenter</br>
Software Lead (Phase 1) - Austin Winters

## 3. Managerial Process Plans

### 3.1. Start-Up Plans

#### 3.1.1 Estimation Plan
* The estimation time was calculated using COCOMO.
* The estimation occurred on 2/10/23
* Dakota and Austin were involved in the estimation process.
* Estimations will be documented in the projects documentation. Estimation Reviews will be done either by Austin or Dakota.

#### FUNCTION POINTS
![image](https://github.com/dakotacarpenter19/CS_491_Project/blob/main/images/FP.JPG)
#### LINES OF CODE
![image](https://github.com/dakotacarpenter19/CS_491_Project/blob/main/images/LOC.JPG)

#### 3.1.2 Staffing Plan
Two software developers are required for the project. The knowledge of Java is also required for the project. 

#### 3.1.3 Resource Acquisition Plan
* Development Resources: Netbeans, Notepad++ for markdown documents, Java distributables for jar files.
* Testing Resources: Junit tests
* Product resources: the project can run on a minimal 1gb drive, integrated graphics, and basic mouse peripherals.

### 3.2. Work Plan
https://app.teamgantt.com/projects/gantt?ids=3396299

![image](https://github.com/dakotacarpenter19/CS_491_Project/blob/b2da5b9a91c61246216e355a39f1c26e38770cb3/documentation/diagrams/ganttchart.png)

### 3.3. Control Plan
There will be scheduled meetings in order to ensure that the project will be delivered on time. If a project member is having trouble with theiur assigned part a plan evaluation would be required to ensure the project remains on schedule.

#### 3.3.1 Data Control Plan
*Data to be managed: user input of their names and moves.
*Content: checkerboard template and a checker piece templates will be used.
*We won't be collecting any user data outside of the name for play.

#### 3.3.2 Requirements Control Plan
We will have meetings every week to two weeks to ensure the requirements are being met and delivered. 

#### 3.3.3 Schedule Control Plan
We are using a Gantt chart in order to ensure the project is being completed on time.

#### 3.3.4 Communication, Tracking, and Reporting Plan
The project manager and lead programmer will be meeting face to face. Email will also be used for memos and emergency planning/communication.

<<<<<<< HEAD
### 3.4. Issue Resolution Plan
=======
### 3.5. Issue Resolution Plan
>>>>>>> 5237655ebfdce677d732324797ccda150e282399
We will document project issues through the projects GitHub repository. The project manager will have the final say in decisions for the project. The lead programmer will be in charge of any changes needed in the software and will have final decision concerning software features.

## 4. Technical Process Plan

### 4.1. Process Model
Our software uses an iterative process model. Each phase of the project will represent a new iteration of our software. Phase 1 will focus on project management. Phases 2, 3, and 4 will focus on project implementation, such as software GUI, game state functionality, and deployment, respectively. 

### 4.2. Methods, Tools, and Techniques
Hardware: Desktop or laptop computer with networking to download the game.<br>
Software tools: Java 8+, Eclipse, and Netbeans.<br>
Development methodologies: Our software will be programmed in Java. Our project will be documented with comments in the code as well as in our SRS document.<br>
Quality assurance practices: We will be reviewing each others' code to peer review it. We will test our software by playing the game ourselves as well as by letting people we know play the game. Our software will also utilize JUnit to test things such as moving pieces, capturing pieces, and winning/losing. 

### 4.3. Configuration Management Plan
This project will use GitHub to manage releases and to report bugs. 

### 4.4. Quality Assurance Plan
Quality assurance will probably account for at least 25% of the project effort, but we expect it to be more than that. Some tasks of QA include things such as making sure game pieces cannot make illegal moves, providing a responsive interface, etc. 

### 4.5. Documentation Plan
We will be making a simple set of game instructions based off of information on the internet. This documentation will be accessible either through the game UI and in the game's directory. 

### 4.6. Process Improvement Plan
Improved usage of GitHub: We will be keeping track of bugs/problems on GitHub rather than communicating them verbally or through email. 

## Revision History
<<<<<<< HEAD
Version 1.0 draft 1 (February 19, 2023) - initial document created. 
=======
Version 1.0 draft 1 (February 19, 2023) - initial document created. 
>>>>>>> 5237655ebfdce677d732324797ccda150e282399
