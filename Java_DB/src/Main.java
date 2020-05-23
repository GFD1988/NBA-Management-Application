import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application{
	//Group
	Group root1 = new Group();
	Group root2 = new Group();
	Group root3 = new Group();
	Group root4 = new Group();
	Group root5 = new Group();
	Group root6 = new Group();
	Group root7 = new Group();
	Group root8 = new Group();
	Group root9 = new Group();
	Group root10 = new Group();
	Group root11 = new Group();
	Group root12 = new Group();
	Group root13 = new Group();
	Group root14 = new Group();
	Group root15 = new Group();
	Group root16 = new Group();
	
	//Scene
	Scene scene1 = new Scene(root1);
	Scene scene2 = new Scene(root2);
	Scene scene3 = new Scene(root3);
	Scene scene4 = new Scene(root4);
	Scene scene5 = new Scene(root5);
	Scene scene6 = new Scene(root6);
	Scene scene7 = new Scene(root7);
	Scene scene8 = new Scene(root8);
	Scene scene9 = new Scene(root9);
	Scene scene10 = new Scene(root10);
	Scene scene11 = new Scene(root11);
	Scene scene12 = new Scene(root12);
	Scene scene13 = new Scene(root13);
	Scene scene14 = new Scene(root14);
	Scene scene15 = new Scene(root15);
	Scene scene16 = new Scene(root16);
	
	//Button
	Button viewDiv = new Button("View");
	Button viewTeam = new Button("View");
	Button viewInfo	 = new Button("View");
	Button addTeam = new Button("Add");
	Button addPlayer = new Button("Add");
	Button addInfo = new Button("Add");
	Button NBACoordinationButton = new Button("Coordinate");
	Button sql = new Button("Direct SQL Injection");
	Button sqlSubmit = new Button("Commit");
	Button help = new Button("Help");
	Button vDivBack = new Button("Back");
	Button vTeamBack = new Button("Back");
	Button vInfoBack = new Button("Back");
	Button vEmployeeBack = new Button("Back");
	Button aTeamBack = new Button("Back");
	Button aPlayerBack = new Button("Back");
	Button aInfoBack = new Button("Back");
	Button sqlBack = new Button("Back");
	Button helpBack = new Button("Back");
	Button UABack = new Button("Back");
	Button NBACoordinationBack = new Button("Back");
	Button manageEmployeeBack = new Button("Back");
	Button updateEmployeeInfoBack = new Button("Back");
	Button addEmployeeBack = new Button("Back");
	Button deleteEmployeeBack = new Button("Back");
	Button exit = new Button("Exit to Desktop");
	Button divNumButton = new Button("Enter");
	Button teamNumButton = new Button("Enter");
	Button infoNumButton = new Button("Enter");
	Button UAButton = new Button("Enter");
	Button aEmployeeButton = new Button("Submit");
	Button uEmployeeButton = new Button("Update");
	Button rEmployeeButton = new Button("Remove");
	Button manageEmployeeButton = new Button("Manage");
	Button viewEmployeeButton = new Button("View");
	Button updateEmployeeInfoButton = new Button("Change");
	Button addEmployeeButton = new Button("Add");
	Button deleteEmployeeButton = new Button("Delete");
	
	Button employeeNameButton = new Button("Enter");
	Button addTeamButton = new Button("Submit Team");
	Button addPlayerButton = new Button("Submit Player");
	Button addInfoButton = new Button("Submit Information");
	
	//TextArea
	TextArea sqlCode = new TextArea();
	TextArea viewDivOutput = new TextArea();
	TextArea viewTeamOutput = new TextArea();
	TextArea viewInfoOutput = new TextArea();
	TextArea viewEmployeeOutput = new TextArea();
	
	//Font
	Font TNR = new Font("Times New Roman", 10);
	Font Magneto = new Font("Magneto Bold", 10);
	
	//employee information management combobox
	ComboBox<String> emp_numCB = new ComboBox<>();
	
	//employee information management text
	Text emp_num_uLabel = new Text("Employee Number:");
	
	//employee information management textfield
	TextField emp_num_u = new TextField();
	TextField emp_value = new TextField();
	
	//remove employee text
	Text emp_num_rLabel = new Text("Employee Number:");
	
	//remove employee textfield
	TextField emp_num_r = new TextField();
	
	//Label
	Label vDiv = new Label(": Click here if you want to view teams in a division.", viewDiv);
	Label vTeam = new Label(": Click here if you want to view players on a team.", viewTeam);
	Label vInfo = new Label(": Click here if you want to view game information.", viewInfo);
	Label aTeam = new Label(": Click here if you want to add a team.", addTeam);
	Label aPlayer = new Label(": Click here if you want to add a player.", addPlayer);
	Label aInfo = new Label(": Click here if you want to add game information.", addInfo);
	Label sqlLabel = new Label(": Click here to manipulate the database.", sql);
	Label vEmployee = new Label(": Click here to view employees.", manageEmployeeButton);
	Label NBACoordinationLabel = new Label(": Click here to coordinate teams, players, and info.", NBACoordinationButton);
	
	//Text
	// text for main screen
	Text title = new Text("National Basketball Association");
	Text vDivH = new Text("View Divisions");
	Text vTeamH = new Text("View Team");
	Text vInfoH = new Text("View Game Information");
	Text vEmployeeH = new Text("Manage Employees");
	Text NBACoordinationH = new Text("NBA Coordination");
	Text aTeamH = new Text("Add Team");
	Text aPlayerH = new Text("Add Player");
	Text aInfoH = new Text("Add Game Information");
	Text DSQLIH = new Text("Database Management");
	
	
	//text page titles
	Text helpTitle = new Text("Help Information");
	Text vDivTitle = new Text("View Divisions");
	Text vTeamTitle = new Text("View Team Roster");
	Text vInfoTitle = new Text("View Game Information");
	Text aTeamTitle = new Text("Add Team");
	Text aPlayerTitle = new Text("Add Player");
	Text aInfoTitle = new Text("Add Game Information");
	Text sqlTitle = new Text("Database Management");
	Text UATitle = new Text("User Authentication");
	Text mEmployeeTitle = new Text("Manage Employees");
	Text vEmployeeTitle = new Text("View Employees");
	Text uEmployeeTitle = new Text("Employee Information Management");
	Text aEmployeeTitle = new Text("Add Employees");
	Text rEmployeeTitle = new Text("Remove Employees");
	
	//conference text
	Text conf_numLabel = new Text("Conference Number: ");
	Text conf_nameLabel = new Text("Conference Name: ");
	
	//division text
	Text div_numLabel = new Text("Division Number: ");
	Text div_nameLabel = new Text("Division Name: ");
	Text conf_num_dLabel = new Text("Conference Number: ");
	
	//game text
	Text game_numLabel = new Text("Game Number: ");
	Text team_1Label = new Text("Home Team: ");
	Text team_2Label = new Text("Away Team: ");
	Text game_scoreLabel = new Text("Final Game Score: ");
	Text game_arenaLabel = new Text("Game Court: ");
	Text game_descriptionLabel = new Text("Game Notes: ");
	
	//player text
	Text player_numLabel = new Text("Player Number: ");
	Text player_fNameLabel = new Text("Players' First Name: ");
	Text player_lNameLabel = new Text("Players' Last Name: ");
	Text team_num_pLabel = new Text("Players' Team Number: ");
	
	//team text
	Text team_numLabel = new Text("Team Number: ");
	Text team_nameLabel = new Text("Team Name: ");
	Text team_mascotLabel = new Text("Team Mascot: ");
	Text team_homeLabel = new Text("Team City: ");
	Text team_arenaLabel = new Text("Team Home Court: ");
	Text team_coachLabel = new Text("Head Coach: ");
	Text div_num_tLabel = new Text("Division Number: ");
	
	//team textfield
	TextField team_num = new TextField();
	TextField team_name = new TextField();
	TextField team_mascot = new TextField();
	TextField team_home = new TextField();
	TextField team_arena = new TextField();
	TextField team_coach = new TextField();
	TextField div_num = new TextField();
	
	//player textfield
	TextField player_num = new TextField();
	TextField player_fName = new TextField();
	TextField player_lName = new TextField();
	TextField team_num_p = new TextField();
	
	//game textfield
	TextField game_num = new TextField();
	TextField team_1 = new TextField();
	TextField team_2 = new TextField();
	TextField game_score = new TextField();
	TextField game_arena = new TextField();
	TextField game_description = new TextField();
	
	//employee textfields
	TextField emp_num = new TextField();
	TextField emp_fName = new TextField();
	TextField emp_lName = new TextField();
	TextField emp_role = new TextField();
	
	//employee text
	Text emp_numLabel = new Text("Employee Number:");
	Text emp_fNameLabel = new Text("Employee First Name:");
	Text emp_lNameLabel = new Text("Employee Last Name:");
	Text emp_roleLabel = new Text("Employee Job Title:");
	
	
	//view page textfields and texts
	TextField divNum = new TextField();
	TextField teamNum = new TextField();
	TextField infoNum = new TextField();
	TextField employeeName = new TextField();
	Text divNumLabel = new Text("Division Number:");
	Text teamNumLabel = new Text("Team Number:");
	Text infoNumLabel = new Text("Game Number:");
	Text employeeNameLabel = new Text("Employee First Name:");
	
	//database management text
	Text sqlInserterLabel = new Text("SQL Inserter: ");
	
	//help page text
	Text headerVD = new Text("View Divisions");
	Text headerVT = new Text("View Team");
	Text headerVGI = new Text("View Game Information");
	Text headerAT = new Text("Add Team");
	Text headerAP = new Text("Add Player");
	Text headerAGI = new Text("Add Game Information");
	Text headerDSQLI = new Text("Direct SQL Injection");
	Text headerVE = new Text("Manage Employees");
	Text pointsVD = new Text("|> The View Divisions option is for viewing the team\n "
			+ "information of teams selected by the parameter\n of your choice "
			+ "using the choicebox.");
			
	Text pointsVT = new Text("|> The View Team option is for viewing \nplayer information"
			+ "based on parameters \nselected in the choicebox.");
	
	Text pointsVGI = new Text("|> The View Game Information option is for\nviewing"
			+ " game information based on \nparameters in the choicebox.");
	
	Text pointsAT = new Text("|> The Add Team option is for adding a team by\n"
			+ "inputting the information prompted for pertaining\n"
			+ " to the potential team.\n(This option is available to "
			+ "NBA coordinators)");
	
	Text pointsAP = new Text("|> The Add Player option is for adding a \nplayer"
			+ " to a team by inputting the\ninformation prompted"
			+ " for.\n(This option is available to NBA coordinators)");
	
	Text pointsAGI = new Text("|> The Add Game Information option is for adding\n"
			+ "game information to a game by inputting\nthe information prompted for."
			+ "\n(This option is available to NBA coordinators)");
	
	Text pointsDSQLI = new Text("|> The Direct SQL Injection option is for"
			+ " directly\nmanipulating the NBA database using SQL code."
			+ "\n(This option is available to the IT department.)");
	
	Text pointsVE = new Text("|> The Manage Employees option is for \nmanaging NBA employee"
			+ " information.\n(This option is available to managers.)");
	
	
	Text divisions = new Text("1 - Northwest\n"
			+ "2 - Pacific\n3 - Southwest\n"
			+ "4 - Altantic\n5 - Central\n"
			+ "6 - Southeast");
	
	//employee role text
	Text emp_roles = new Text("Employee Job List\n"
			+ "- Manager\n"
			+ "- Programmer\n"
			+ "- NBA Coordinator");
	
	//user authentication text
	Text UAh = new Text("User Number: ");
	//user authentication textfield
	TextField UATextField = new TextField();
	
	
	//manage employees page text
	Text viewEmployeeLabel = new Text("View Employees:");
	Text updateEmployeeInfoLabel = new Text("Change Employee Information:");
	Text addEmployeeLabel = new Text("Add Employee:");
	Text deleteEmployeeLabel = new Text("Remove Employee:");
	
	
	//Line
	Line divider1 = new Line(950, 220, 950, 600);
	
	Boolean accessGranted;
	String role;
	String[] emp_attributes = {"Employee Number", "Employee First Name", "Employee Last Name", "Employee Job Title"};
	ObservableList<String> emp_list = FXCollections.observableArrayList(emp_attributes);
	
	
	
	public void start(Stage stage) throws FileNotFoundException {
		
		
		//images
		Image b1 = new Image(new FileInputStream("images/background_basketball.png"));
		Image pg1 = new Image(new FileInputStream("images/page.png"));

		
		
		//imageviews
		ImageView background1 = new ImageView(b1);
		ImageView page1 = new ImageView(pg1);
		ImageView background2 = new ImageView(b1);
		ImageView page2 = new ImageView(pg1);
		ImageView background3 = new ImageView(b1);
		ImageView page3 = new ImageView(pg1);
		ImageView background4 = new ImageView(b1);
		ImageView page4 = new ImageView(pg1);
		ImageView background5 = new ImageView(b1);
		ImageView page5 = new ImageView(pg1);
		ImageView background6 = new ImageView(b1);
		ImageView page6 = new ImageView(pg1);
		ImageView background7 = new ImageView(b1);
		ImageView page7 = new ImageView(pg1);
		ImageView background8 = new ImageView(b1);
		ImageView page8 = new ImageView(pg1);
		ImageView background9 = new ImageView(b1);
		ImageView page9 = new ImageView(pg1);
		ImageView background10 = new ImageView(b1);
		ImageView page10 = new ImageView(pg1);
		ImageView background11 = new ImageView(b1);
		ImageView page11 = new ImageView(pg1);
		ImageView background12 = new ImageView(b1);
		ImageView page12 = new ImageView(pg1);
		ImageView background13 = new ImageView(b1);
		ImageView page13 = new ImageView(pg1);
		ImageView background14 = new ImageView(b1);
		ImageView page14 = new ImageView(pg1);
		ImageView background15 = new ImageView(b1);
		ImageView page15 = new ImageView(pg1);
		ImageView background16 = new ImageView(b1);
		ImageView page16 = new ImageView(pg1);
		
		//text configurations
		
		//main screen text
		
		//title configurations
		title.setX(900);
		title.setY(100);
		title.setFont(Magneto);
		title.setFill(Color.BLACK);
		title.setUnderline(true);
		title.setScaleX(10);
		title.setScaleY(10);
		//help page title configurations
		helpTitle.setX(900);
		helpTitle.setY(100);
		helpTitle.setFont(TNR);
		helpTitle.setScaleX(10);
		helpTitle.setScaleY(10);
		//vDivTitle configurations
		vDivTitle.setX(900);
		vDivTitle.setY(100);
		vDivTitle.setFont(TNR);
		vDivTitle.setScaleX(10);
		vDivTitle.setScaleY(10);
		//vTeamTitle configurations
		vTeamTitle.setX(900);
		vTeamTitle.setY(100);
		vTeamTitle.setFont(TNR);
		vTeamTitle.setScaleX(10);
		vTeamTitle.setScaleY(10);
		//vInfoTitle configurations
		vInfoTitle.setX(900);
		vInfoTitle.setY(100);
		vInfoTitle.setFont(TNR);
		vInfoTitle.setScaleX(10);
		vInfoTitle.setScaleY(10);
		//aTeamTitle configurations
		aTeamTitle.setX(900);
		aTeamTitle.setY(100);
		aTeamTitle.setFont(TNR);
		aTeamTitle.setScaleX(10);
		aTeamTitle.setScaleY(10);
		//aPlayerTitle configurations
		aPlayerTitle.setX(900);
		aPlayerTitle.setY(100);
		aPlayerTitle.setFont(TNR);
		aPlayerTitle.setScaleX(10);
		aPlayerTitle.setScaleY(10);
		//aInfoTitle configurations
		aInfoTitle.setX(900);
		aInfoTitle.setY(100);
		aInfoTitle.setFont(TNR);
		aInfoTitle.setScaleX(10);
		aInfoTitle.setScaleY(10);
		//user authentication title configurations
		UATitle.setX(900);
		UATitle.setY(100);
		UATitle.setFont(TNR);
		UATitle.setScaleX(10);
		UATitle.setScaleY(10);
		//vEmployeeTitle configurations
		vEmployeeTitle.setX(900);
		vEmployeeTitle.setY(100);
		vEmployeeTitle.setFont(TNR);
		vEmployeeTitle.setScaleX(10);
		vEmployeeTitle.setScaleY(10);	
		//uEmployeeTitle configurations
		uEmployeeTitle.setX(900);
		uEmployeeTitle.setY(100);
		uEmployeeTitle.setFont(TNR);
		uEmployeeTitle.setScaleX(10);
		uEmployeeTitle.setScaleY(10);
		//aEmployeeTitle configurations
		aEmployeeTitle.setX(900);
		aEmployeeTitle.setY(100);
		aEmployeeTitle.setFont(TNR);
		aEmployeeTitle.setScaleX(10);
		aEmployeeTitle.setScaleY(10);
		//rEmployeeTitle configurations
		rEmployeeTitle.setX(900);
		rEmployeeTitle.setY(100);
		rEmployeeTitle.setFont(TNR);
		rEmployeeTitle.setScaleX(10);
		rEmployeeTitle.setScaleY(10);
		//mEmployeeTitle configurations
		mEmployeeTitle.setX(900);
		mEmployeeTitle.setY(100);
		mEmployeeTitle.setFont(TNR);
		mEmployeeTitle.setScaleX(10);
		mEmployeeTitle.setScaleY(10);
		//vDivH configurations
		vDivH.setX(700);
		vDivH.setY(250);
		vDivH.setFont(TNR);
		vDivH.setScaleX(3);
		vDivH.setScaleY(3);
		//vTeamH configurations
		vTeamH.setX(700);
		vTeamH.setY(375);
		vTeamH.setFont(TNR);
		vTeamH.setScaleX(3);
		vTeamH.setScaleY(3);
		//vInfoH configurations
		vInfoH.setX(700);
		vInfoH.setY(500);
		vInfoH.setFont(TNR);
		vInfoH.setScaleX(3);
		vInfoH.setScaleY(3);
		//aTeamH configurations
		aTeamH.setX(940);
		aTeamH.setY(300);
		aTeamH.setFont(TNR);
		aTeamH.setScaleX(3);
		aTeamH.setScaleY(3);
		//aPlayerH configurations
		aPlayerH.setX(945);
		aPlayerH.setY(500);
		aPlayerH.setFont(TNR);
		aPlayerH.setScaleX(3);
		aPlayerH.setScaleY(3);
		//aInfoH configurations
		aInfoH.setX(930);
		aInfoH.setY(700);
		aInfoH.setFont(TNR);
		aInfoH.setScaleX(3);
		aInfoH.setScaleY(3);
		//DSQLIH configurations
		DSQLIH.setX(1100);
		DSQLIH.setY(560);
		DSQLIH.setFont(TNR);
		DSQLIH.setScaleX(3);
		DSQLIH.setScaleY(3);
		//NBACoordinationH configurations
		NBACoordinationH.setX(1100);
		NBACoordinationH.setY(350);
		NBACoordinationH.setFont(TNR);
		NBACoordinationH.setScaleX(3);
		NBACoordinationH.setScaleY(3);
		//vEmployeeH configurations
		vEmployeeH.setX(700);
		vEmployeeH.setY(625);
		vEmployeeH.setFont(TNR);
		vEmployeeH.setScaleX(3);
		vEmployeeH.setScaleY(3);
		//sqlTitle configurations
		sqlTitle.setX(900);
		sqlTitle.setY(100);
		sqlTitle.setFont(TNR);
		sqlTitle.setScaleX(10);
		sqlTitle.setScaleY(10);
		//div_numLabel configurations
		div_numLabel.setX(800);
		div_numLabel.setY(400);
		div_numLabel.setScaleX(2);
		div_numLabel.setScaleY(2);
		//divNumLabel configurations
		divNumLabel.setX(800);
		divNumLabel.setY(350);
		divNumLabel.setScaleX(2);
		divNumLabel.setScaleY(2);
		//teamNumLabel configurations
		teamNumLabel.setX(820);
		teamNumLabel.setY(350);
		teamNumLabel.setScaleX(2);
		teamNumLabel.setScaleY(2);
		//infoNumLabel configurations
		infoNumLabel.setX(820);
		infoNumLabel.setY(350);
		infoNumLabel.setScaleX(2);
		infoNumLabel.setScaleY(2);
		//employeeNameLabel configurations
		employeeNameLabel.setX(770);
		employeeNameLabel.setY(350);
		employeeNameLabel.setScaleX(2);
		employeeNameLabel.setScaleY(2);
		
		
		//Direct SQL Injection text
		UAh.setX(770);
		UAh.setY(513);
		UAh.setFont(TNR);
		UAh.setScaleX(3);
		UAh.setScaleY(3);
		
		//add team page text
		
		//team_numLabel configurations
		team_numLabel.setX(800);
		team_numLabel.setY(300);
		team_numLabel.setScaleX(2);
		team_numLabel.setScaleY(2);
		team_numLabel.setUnderline(true);
		//team_nameLabel configurations
		team_nameLabel.setX(800);
		team_nameLabel.setY(375);
		team_nameLabel.setScaleX(2);
		team_nameLabel.setScaleY(2);
		team_nameLabel.setUnderline(true);
		//team_mascotLabel configurations
		team_mascotLabel.setX(800);
		team_mascotLabel.setY(450);
		team_mascotLabel.setScaleX(2);
		team_mascotLabel.setScaleY(2);
		team_mascotLabel.setUnderline(true);
		//team_homeLabel configurations
		team_homeLabel.setX(800);
		team_homeLabel.setY(525);
		team_homeLabel.setScaleX(2);
		team_homeLabel.setScaleY(2);
		team_homeLabel.setUnderline(true);
		//team_arenaLabel configurations
		team_arenaLabel.setX(770);
		team_arenaLabel.setY(600);
		team_arenaLabel.setScaleX(2);
		team_arenaLabel.setScaleY(2);
		team_arenaLabel.setUnderline(true);
		//team_coachLabel
		team_coachLabel.setX(800);
		team_coachLabel.setY(675);
		team_coachLabel.setScaleX(2);
		team_coachLabel.setScaleY(2);
		team_coachLabel.setUnderline(true);
		//div_num_tLabel configurations
		div_num_tLabel.setX(780);
		div_num_tLabel.setY(750);
		div_num_tLabel.setScaleX(2);
		div_num_tLabel.setScaleY(2);
		div_num_tLabel.setUnderline(true);
		//player_numLabel configurations
		player_numLabel.setTranslateX(830);
		player_numLabel.setTranslateY(310);
		player_numLabel.setScaleX(2);
		player_numLabel.setScaleY(2);
		player_numLabel.setUnderline(true);
		//player_fNameLabel configurations
		player_fNameLabel.setTranslateX(800);
		player_fNameLabel.setTranslateY(460);
		player_fNameLabel.setScaleX(2);
		player_fNameLabel.setScaleY(2);
		player_fNameLabel.setUnderline(true);
		//player_lNameLabel configurations
		player_lNameLabel.setTranslateX(800);
		player_lNameLabel.setTranslateY(610);
		player_lNameLabel.setScaleX(2);
		player_lNameLabel.setScaleY(2);
		player_lNameLabel.setUnderline(true);
		//team_num_pLabel configurations
		team_num_pLabel.setTranslateX(770);
		team_num_pLabel.setTranslateY(760);
		team_num_pLabel.setScaleX(2);
		team_num_pLabel.setScaleY(2);
		team_num_pLabel.setUnderline(true);
		//game_numLabel configurations
		game_numLabel.setX(800);
		game_numLabel.setY(300);
		game_numLabel.setScaleX(2);
		game_numLabel.setScaleY(2);
		game_numLabel.setUnderline(true);
		//team_1Label configurations
		team_1Label.setX(820);
		team_1Label.setY(375);
		team_1Label.setScaleX(2);
		team_1Label.setScaleY(2);
		team_1Label.setUnderline(true);
		//team_2Label configurations
		team_2Label.setX(820);
		team_2Label.setY(450);
		team_2Label.setScaleX(2);
		team_2Label.setScaleY(2);
		team_2Label.setUnderline(true);
		//game_scoreLabel configurations
		game_scoreLabel.setX(780);
		game_scoreLabel.setY(525);
		game_scoreLabel.setScaleX(2);
		game_scoreLabel.setScaleY(2);
		game_scoreLabel.setUnderline(true);
		//game_arenaLabel configurations
		game_arenaLabel.setX(820);
		game_arenaLabel.setY(600);
		game_arenaLabel.setScaleX(2);
		game_arenaLabel.setScaleY(2);
		game_arenaLabel.setUnderline(true);
		//game_descriptionLabel configurations
		game_descriptionLabel.setX(820);
		game_descriptionLabel.setY(675);
		game_descriptionLabel.setScaleX(2);
		game_descriptionLabel.setScaleY(2);
		game_descriptionLabel.setUnderline(true);
		//viewEmployeeLabel configurations
		viewEmployeeLabel.setX(880);
		viewEmployeeLabel.setY(315);
		viewEmployeeLabel.setScaleX(2);
		viewEmployeeLabel.setScaleY(2);
		viewEmployeeLabel.setUnderline(true);
		//updateEmployeeInfoLabel configurations
		updateEmployeeInfoLabel.setX(825);
		updateEmployeeInfoLabel.setY(415);
		updateEmployeeInfoLabel.setScaleX(2);
		updateEmployeeInfoLabel.setScaleY(2);
		updateEmployeeInfoLabel.setUnderline(true);
		//addEmployeeLabel configurations
		addEmployeeLabel.setX(890);
		addEmployeeLabel.setY(515);
		addEmployeeLabel.setScaleX(2);
		addEmployeeLabel.setScaleY(2);
		addEmployeeLabel.setUnderline(true);
		//deleteEmployeeLabel configurations
		deleteEmployeeLabel.setX(875);
		deleteEmployeeLabel.setY(615);
		deleteEmployeeLabel.setScaleX(2);
		deleteEmployeeLabel.setScaleY(2);
		deleteEmployeeLabel.setUnderline(true);
		
		
		
		
		
		//database page configurations
		sqlInserterLabel.setX(634);
		sqlInserterLabel.setY(310);
		sqlInserterLabel.setFont(TNR);
		sqlInserterLabel.setUnderline(true);
		sqlInserterLabel.setScaleX(2);
		sqlInserterLabel.setScaleY(2);
		
		
		//page imageview configuration
		page1.setX(560);
		page1.setY(200);
		page1.setFitWidth(800);
		page1.setFitHeight(700);
		page2.setX(560);
		page2.setY(200);
		page2.setFitWidth(800);
		page2.setFitHeight(700);
		page3.setX(560);
		page3.setY(200);
		page3.setFitWidth(800);
		page3.setFitHeight(700);
		page4.setX(560);
		page4.setY(200);
		page4.setFitWidth(800);
		page4.setFitHeight(700);
		page5.setX(560);
		page5.setY(200);
		page5.setFitWidth(800);
		page5.setFitHeight(700);
		page6.setX(560);
		page6.setY(200);
		page6.setFitWidth(800);
		page6.setFitHeight(700);
		page7.setX(560);
		page7.setY(200);
		page7.setFitWidth(800);
		page7.setFitHeight(700);
		page8.setX(560);
		page8.setY(200);
		page8.setFitWidth(800);
		page8.setFitHeight(700);
		page9.setX(560);
		page9.setY(200);
		page9.setFitWidth(800);
		page9.setFitHeight(700);
		page10.setX(560);
		page10.setY(200);
		page10.setFitWidth(800);
		page10.setFitHeight(700);
		page11.setX(560);
		page11.setY(200);
		page11.setFitWidth(800);
		page11.setFitHeight(700);
		page12.setX(560);
		page12.setY(200);
		page12.setFitWidth(800);
		page12.setFitHeight(700);
		page13.setX(560);
		page13.setY(200);
		page13.setFitWidth(800);
		page13.setFitHeight(700);
		page14.setX(560);
		page14.setY(200);
		page14.setFitWidth(800);
		page14.setFitHeight(700);
		page15.setX(560);
		page15.setY(200);
		page15.setFitWidth(800);
		page15.setFitHeight(700);
		page16.setX(560);
		page16.setY(200);
		page16.setFitWidth(800);
		page16.setFitHeight(700);
		
		
		
		//textarea configurations
		sqlCode.setTranslateX(720);
		sqlCode.setTranslateY(300);
		sqlCode.setMinSize(500, 550);
		viewDivOutput.setTranslateX(720);
		viewDivOutput.setTranslateY(400);
		viewDivOutput.setMinSize(500, 450);
		viewTeamOutput.setTranslateX(720);
		viewTeamOutput.setTranslateY(400);
		viewTeamOutput.setMinSize(500, 450);
		viewInfoOutput.setTranslateX(720);
		viewInfoOutput.setTranslateY(400);
		viewInfoOutput.setMinSize(500, 450);
		viewEmployeeOutput.setTranslateX(720);
		viewEmployeeOutput.setTranslateY(400);
		viewEmployeeOutput.setMinSize(500, 450);
		
		
		//textfield configurations
		
		//add team textfields
		//team_num configurations
		team_num.setTranslateX(930);
		team_num.setTranslateY(285);
		//team_name configurations
		team_name.setTranslateX(930);
		team_name.setTranslateY(360);
		//team_mascot configurations
		team_mascot.setTranslateX(930);
		team_mascot.setTranslateY(435);
		//team_home configurations
		team_home.setTranslateX(930);
		team_home.setTranslateY(510);
		//team_arena configurations
		team_arena.setTranslateX(930);
		team_arena.setTranslateY(585);
		//team_coach configurations
		team_coach.setTranslateX(930);
		team_coach.setTranslateY(660);
		//div_num configurations
		div_num.setTranslateX(930);
		div_num.setTranslateY(735);
		//divNum configurations
		divNum.setTranslateX(950);
		divNum.setTranslateY(335);
		divNum.setMaxWidth(30);
		//teamNum configurations
		teamNum.setTranslateX(950);
		teamNum.setTranslateY(335);
		teamNum.setMaxWidth(30);
		//infoNum configurations
		infoNum.setTranslateX(950);
		infoNum.setTranslateY(335);
		infoNum.setMaxWidth(30);
		//UATextField configurations
		UATextField.setTranslateX(885);
		UATextField.setTranslateY(500);
		//employeeName configurations
		employeeName.setTranslateX(950);
		employeeName.setTranslateY(335);
		
		
		//add team textfields configurations
		player_num.setTranslateX(960);
		player_num.setTranslateY(300);
		//team_name configurations
		player_fName.setTranslateX(960);
		player_fName.setTranslateY(450);
		//team_mascot configurations
		player_lName.setTranslateX(960);
		player_lName.setTranslateY(600);
		//team_home configurations
		team_num_p.setTranslateX(960);
		team_num_p.setTranslateY(750);
		//divisions configurations
		divisions.setScaleX(2);
		divisions.setScaleY(2);
		divisions.setX(1200);
		divisions.setY(700);
		
		//add employee textfields configurations
		emp_num.setTranslateX(960);
		emp_num.setTranslateY(300);
		emp_fName.setTranslateX(960);
		emp_fName.setTranslateY(450);
		emp_lName.setTranslateX(960);
		emp_lName.setTranslateY(600);
		emp_role.setTranslateX(960);
		emp_role.setTranslateY(750);
		
		//add employee text configurations
		emp_numLabel.setX(800);
		emp_numLabel.setY(315);
		emp_numLabel.setScaleX(2);
		emp_numLabel.setScaleY(2);
		emp_fNameLabel.setX(780);
		emp_fNameLabel.setY(465);
		emp_fNameLabel.setScaleX(2);
		emp_fNameLabel.setScaleY(2);
		emp_lNameLabel.setX(780);
		emp_lNameLabel.setY(615);
		emp_lNameLabel.setScaleX(2);
		emp_lNameLabel.setScaleY(2);
		emp_roleLabel.setX(800);
		emp_roleLabel.setY(765);
		emp_roleLabel.setScaleX(2);
		emp_roleLabel.setScaleY(2);
		emp_roles.setX(1160);
		emp_roles.setY(780);
		emp_roles.setScaleX(1.75);
		emp_roles.setScaleY(1.75);
		
		
		//employee information management combobox configurations
		emp_numCB.getItems().addAll(emp_list);
		emp_numCB.setTranslateX(790);
		emp_numCB.setTranslateY(550);
		emp_numCB.setPromptText("Select an Attribute");
		
		//employee information management textfield configurations
		emp_num_u.setTranslateX(960);
		emp_num_u.setTranslateY(300);
		emp_value.setTranslateX(967);
		emp_value.setTranslateY(550);
		
		//employee information management text configurations
		emp_num_uLabel.setX(800);
		emp_num_uLabel.setY(315);
		emp_num_uLabel.setScaleX(2);
		emp_num_uLabel.setScaleY(2);
		emp_num_uLabel.setUnderline(true);
		
		//remove employee configurations
		emp_num_r.setTranslateX(960);
		emp_num_r.setTranslateY(540);
		emp_num_rLabel.setX(800);
		emp_num_rLabel.setY(555);
		emp_num_rLabel.setScaleX(2);
		emp_num_rLabel.setScaleY(2);
		
		//label configuration
		vDiv.setTranslateX(600);
		vDiv.setTranslateY(275);
		vDiv.setUnderline(true);
		vTeam.setTranslateX(600);
		vTeam.setTranslateY(400);
		vTeam.setUnderline(true);
		vInfo.setTranslateX(600);
		vInfo.setTranslateY(525);
		vInfo.setUnderline(true);
		aTeam.setTranslateX(865);
		aTeam.setTranslateY(350);
		aTeam.setUnderline(true);
		aPlayer.setTranslateX(865);
		aPlayer.setTranslateY(550);
		aPlayer.setUnderline(true);
		aInfo.setTranslateX(830);
		aInfo.setTranslateY(750);
		aInfo.setUnderline(true);
		sqlLabel.setTranslateX(1000);
		sqlLabel.setTranslateY(600);
		sqlLabel.setUnderline(true);
		help.setTranslateX(1200);
		help.setTranslateY(870);
		//vEmployee configurations
		vEmployee.setTranslateX(600);
		vEmployee.setTranslateY(670);
		vEmployee.setUnderline(true);
		//NBACoordinationLabel configurations
		NBACoordinationLabel.setTranslateX(1000);
		NBACoordinationLabel.setTranslateY(400);
		NBACoordinationLabel.setUnderline(true);
		//add team textfields
		//team_num configurations
		game_num.setTranslateX(930);
		game_num.setTranslateY(285);
		//team_name configurations
		team_1.setTranslateX(930);
		team_1.setTranslateY(360);
		//team_mascot configurations
		team_2.setTranslateX(930);
		team_2.setTranslateY(435);
		//team_home configurations
		game_score.setTranslateX(930);
		game_score.setTranslateY(510);
		//team_arena configurations
		game_arena.setTranslateX(930);
		game_arena.setTranslateY(585);
		//team_coach configurations
		game_description.setTranslateX(930);
		game_description.setTranslateY(660);
		
		
		//button configuration
		
		//back buttons
		vDivBack.setTranslateX(600);
		vDivBack.setTranslateY(240);
		vTeamBack.setTranslateX(600);
		vTeamBack.setTranslateY(240);
		vInfoBack.setTranslateX(600);
		vInfoBack.setTranslateY(240);
		vEmployeeBack.setTranslateX(600);
		vEmployeeBack.setTranslateY(240);
		aTeamBack.setTranslateX(600);
		aTeamBack.setTranslateY(240);
		aPlayerBack.setTranslateX(600);
		aPlayerBack.setTranslateY(240);
		aInfoBack.setTranslateX(600);
		aInfoBack.setTranslateY(240);
		sqlBack.setTranslateX(600);
		sqlBack.setTranslateY(240);
		helpBack.setTranslateX(600);
		helpBack.setTranslateY(240);
		UABack.setTranslateX(600);
		UABack.setTranslateY(240);
		NBACoordinationBack.setTranslateX(600);
		NBACoordinationBack.setTranslateY(240);
		manageEmployeeBack.setTranslateX(600);
		manageEmployeeBack.setTranslateY(240);
		updateEmployeeInfoBack.setTranslateX(600);
		updateEmployeeInfoBack.setTranslateY(240);
		addEmployeeBack.setTranslateX(600);
		addEmployeeBack.setTranslateY(240);
		deleteEmployeeBack.setTranslateX(600);
		deleteEmployeeBack.setTranslateY(240);
		
		
		//exit button
		exit.setTranslateX(680);
		exit.setTranslateY(870);
		
		//enter buttons
		divNumButton.setTranslateX(1000);
		divNumButton.setTranslateY(335);
		teamNumButton.setTranslateX(1000);
		teamNumButton.setTranslateY(335);
		infoNumButton.setTranslateX(1000);
		infoNumButton.setTranslateY(335);
		employeeNameButton.setTranslateX(1140);
		employeeNameButton.setTranslateY(335);
		sqlSubmit.setTranslateX(1160);
		sqlSubmit.setTranslateY(860);
		UAButton.setTranslateX(1050);
		UAButton.setTranslateY(500);
		addTeamButton.setTranslateX(915);
		addTeamButton.setTranslateY(810);
		addPlayerButton.setTranslateX(915);
		addPlayerButton.setTranslateY(830);
		addInfoButton.setTranslateX(895);
		addInfoButton.setTranslateY(770);
		viewEmployeeButton.setTranslateX(1020);
		viewEmployeeButton.setTranslateY(300);
		updateEmployeeInfoButton.setTranslateX(1080);
		updateEmployeeInfoButton.setTranslateY(400);
		addEmployeeButton.setTranslateX(1020);
		addEmployeeButton.setTranslateY(500);
		deleteEmployeeButton.setTranslateX(1035);
		deleteEmployeeButton.setTranslateY(600);
		aEmployeeButton.setTranslateX(925);
		aEmployeeButton.setTranslateY(850);
		uEmployeeButton.setTranslateX(925);
		uEmployeeButton.setTranslateY(850);
		rEmployeeButton.setTranslateX(925);
		rEmployeeButton.setTranslateY(850);
		
		
		//main screen buttons
		
		//help page text configurations
		headerVD.setX(700);
		headerVD.setY(300);
		headerVD.setUnderline(true);
		headerVD.setFont(TNR);
		headerVD.setScaleX(3);
		headerVD.setScaleY(3);
		pointsVD.setX(700);
		pointsVD.setY(350);
		pointsVD.setFont(TNR);
		pointsVD.setScaleX(1.5);
		pointsVD.setScaleY(1.5);
		headerVT.setX(700);
		headerVT.setY(450);
		headerVT.setUnderline(true);
		headerVT.setFont(TNR);
		headerVT.setScaleX(3);
		headerVT.setScaleY(3);
		pointsVT.setX(700);
		pointsVT.setY(500);
		pointsVT.setFont(TNR);
		pointsVT.setScaleX(1.5);
		pointsVT.setScaleY(1.5);
		headerVGI.setX(700);
		headerVGI.setY(600);
		headerVGI.setUnderline(true);
		headerVGI.setFont(TNR);
		headerVGI.setScaleX(3);
		headerVGI.setScaleY(3);
		pointsVGI.setX(700);
		pointsVGI.setY(650);
		pointsVGI.setFont(TNR);
		pointsVGI.setScaleX(1.5);
		pointsVGI.setScaleY(1.5);
		headerAT.setX(1100);
		headerAT.setY(300);
		headerAT.setUnderline(true);
		headerAT.setFont(TNR);
		headerAT.setScaleX(3);
		headerAT.setScaleY(3);
		pointsAT.setX(1100);
		pointsAT.setY(350);
		pointsAT.setFont(TNR);
		pointsAT.setScaleX(1.5);
		pointsAT.setScaleY(1.5);
		headerAP.setX(1100);
		headerAP.setY(450);
		headerAP.setUnderline(true);
		headerAP.setFont(TNR);
		headerAP.setScaleX(3);
		headerAP.setScaleY(3);
		pointsAP.setX(1100);
		pointsAP.setY(500);
		pointsAP.setFont(TNR);
		pointsAP.setScaleX(1.5);
		pointsAP.setScaleY(1.5);
		headerAGI.setX(1100);
		headerAGI.setY(600);
		headerAGI.setUnderline(true);
		headerAGI.setFont(TNR);
		headerAGI.setScaleX(3);
		headerAGI.setScaleY(3);
		pointsAGI.setX(1100);
		pointsAGI.setY(650);
		pointsAGI.setFont(TNR);
		pointsAGI.setScaleX(1.5);
		pointsAGI.setScaleY(1.5);
		headerVE.setX(700);
		headerVE.setY(750);
		headerVE.setUnderline(true);
		headerVE.setFont(TNR);
		headerVE.setScaleX(3);
		headerVE.setScaleY(3);
		pointsVE.setX(700);
		pointsVE.setY(800);
		pointsVE.setFont(TNR);
		pointsVE.setScaleX(1.5);
		pointsVE.setScaleY(1.5);
		headerDSQLI.setX(1080);
		headerDSQLI.setY(750);
		headerDSQLI.setUnderline(true);
		headerDSQLI.setFont(TNR);
		headerDSQLI.setScaleX(3);
		headerDSQLI.setScaleY(3);
		pointsDSQLI.setX(1050);
		pointsDSQLI.setY(800);
		pointsDSQLI.setFont(TNR);
		pointsDSQLI.setScaleX(1.5);
		pointsDSQLI.setScaleY(1.5);
		
		//groups
		
		//main screen page
		root1.getChildren().addAll(background1, page1, title, vDivH, vDiv, vTeamH,
				vTeam, vInfoH, vInfo, DSQLIH, vEmployee, vEmployeeH, help, 
				NBACoordinationH, NBACoordinationButton, NBACoordinationLabel,
				sqlLabel, exit);
		//view Division page
		root2.getChildren().addAll(background2, page2, vDivTitle, vDivBack, divNum, 
				divNumLabel, divNumButton, viewDivOutput);
		//view Team page
		root3.getChildren().addAll(background3, page3, vTeamTitle, vTeamBack, 
				teamNum, teamNumLabel, teamNumButton, viewTeamOutput);
		//view Game Information page
		root4.getChildren().addAll(background4, page4, vInfoTitle, vInfoBack, 
				infoNum, infoNumLabel, infoNumButton,viewInfoOutput);
		//add Team page
		root5.getChildren().addAll(background5, page5, aTeamTitle, aTeamBack,
				team_numLabel, team_num, team_nameLabel, team_name, 
				team_mascotLabel, team_mascot, team_homeLabel, team_home, 
				team_arenaLabel, team_arena, team_coachLabel, team_coach, 
				div_num_tLabel, div_num, addTeamButton, divisions);
		//add Player page
		root6.getChildren().addAll(background6, page6, aPlayerTitle, aPlayerBack,
				player_num, player_fName, player_lName, team_num_p, 
				player_numLabel, player_fNameLabel, player_lNameLabel, team_num_pLabel,
				addPlayerButton);
		//add Game Information page
		root7.getChildren().addAll(background7, page7, aInfoTitle, aInfoBack,
				game_num, team_1, team_2, game_score, game_arena,
				game_description, game_numLabel, team_1Label, team_2Label,
				game_scoreLabel, game_arenaLabel, game_descriptionLabel, addInfoButton);
		//Direct SQL Injection page
		root8.getChildren().addAll(background8, page8, sqlTitle, sqlBack, sqlCode,
				sqlSubmit, sqlInserterLabel);
		//help page
		root9.getChildren().addAll(background9, page9, helpTitle, helpBack, headerVD,
				headerVT, headerVGI, headerAT, headerAP, headerAGI, headerVE,
				headerDSQLI, pointsVD, pointsVT, pointsVGI, pointsAT, pointsAP,
				pointsAGI, pointsVE, pointsDSQLI);
		//user authentication page
		root10.getChildren().addAll(background10, page10, UATitle, UATextField, 
				UABack, UAh, UAButton);
		//view Employee page
		root11.getChildren().addAll(background11, page11, viewEmployeeOutput, 
				vEmployeeBack, employeeNameLabel, employeeName,
				employeeNameButton, vEmployeeTitle);
		//NBA Coordination page
		root12.getChildren().addAll(background12, page12, aTeam, aPlayer, aInfo, 
				aTeamH, aPlayerH, aInfoH, NBACoordinationBack);
		//manage Employees page
		root13.getChildren().addAll(background13, page13, viewEmployeeButton, 
				updateEmployeeInfoButton, addEmployeeButton, deleteEmployeeButton,
				viewEmployeeLabel, updateEmployeeInfoLabel, addEmployeeLabel,
				deleteEmployeeLabel, manageEmployeeBack, mEmployeeTitle);
		//update Employees information page
		root14.getChildren().addAll(background14, page14, updateEmployeeInfoBack, uEmployeeTitle,
				uEmployeeButton, emp_numCB, emp_num_u, emp_num_uLabel, emp_value);
		root15.getChildren().addAll(background15, page15, addEmployeeBack, emp_num,
				emp_numLabel, emp_fName, emp_fNameLabel, emp_lName, emp_lNameLabel,
				emp_role, emp_roleLabel, emp_roles, aEmployeeTitle, aEmployeeButton);
		root16.getChildren().addAll(background16, page16, deleteEmployeeBack, rEmployeeTitle, 
				rEmployeeButton, emp_num_r, emp_num_rLabel);
		
		
		
		
		
		//lambda expressions
		
		//viewDiv buttons
		viewDiv.setOnAction(e -> {
			stage.setScene(scene2);
		});
		
		divNumButton.setOnAction(e -> {
			viewDivOutput.clear();
			viewDiv(divNum, viewDivOutput);
		});
		
		divNum.setOnAction(e -> {
			viewDivOutput.clear();
			viewDiv(divNum, viewDivOutput);
		});
		
		
		//viewTeam buttons
		viewTeam.setOnAction(e -> {
			stage.setScene(scene3);	
		});
		
		teamNumButton.setOnAction(e -> {
			viewTeamOutput.clear();
			viewTeam(teamNum, viewTeamOutput);
		});
		
		teamNum.setOnAction(e -> {
			viewTeamOutput.clear();
			viewTeam(teamNum, viewTeamOutput);
		});
		
		//UA page buttons
		UAButton.setOnAction(e -> {
			if(role.contentEquals("Programmer")) {
				if(userAuthenticationP(UATextField, accessGranted)) {
					stage.setScene(scene8);
				}
			}else if(role.contentEquals("Manager")) {
				if(userAuthenticationM(UATextField, accessGranted)) {
						stage.setScene(scene13);
				}
			}else if(role.contentEquals("NBA Coordinator")) {
				if(userAuthenticationC(UATextField, accessGranted)) {
					stage.setScene(scene12);
				}
			}
		});
		
		UATextField.setOnAction(e -> {
			if(role.contentEquals("Programmer")) {
				if(userAuthenticationP(UATextField, accessGranted)) {
					stage.setScene(scene8);
				}
			}else if(role.contentEquals("Manager")) {
				if(userAuthenticationM(UATextField, accessGranted)) {
						stage.setScene(scene13);
				}
			}else if(role.contentEquals("NBA Coordinator")) {
				if(userAuthenticationC(UATextField, accessGranted)) {
					stage.setScene(scene12);
				}
			}
		});
		
		
		//viewInfo buttons
		viewInfo.setOnAction(e -> {
			stage.setScene(scene4);
		});
		
		infoNumButton.setOnAction(e -> {
			viewInfoOutput.clear();
			viewGameInfo(infoNum, viewInfoOutput);
		});
		
		infoNum.setOnAction(e -> {
			viewInfoOutput.clear();
			viewGameInfo(infoNum, viewInfoOutput);
		});
		
		
		//manageEmployees buttons
		manageEmployeeButton.setOnAction(e -> {
			role = "Manager";
			UATextField.clear();
			stage.setScene(scene10);
		});
		
		employeeName.setOnAction(e -> {
			viewEmployeeOutput.clear();
			viewEmployeeInfo(employeeName, viewEmployeeOutput);
		});
		
		employeeNameButton.setOnAction(e -> {
			viewEmployeeOutput.clear();
			viewEmployeeInfo(employeeName, viewEmployeeOutput);
		});
		
		viewEmployeeButton.setOnAction(e -> {
			stage.setScene(scene11);
		});
		
		updateEmployeeInfoButton.setOnAction(e -> {
			stage.setScene(scene14);
		});
		
		addEmployeeButton.setOnAction(e -> {
			stage.setScene(scene15);
		});
		
		deleteEmployeeButton.setOnAction(e -> {
			stage.setScene(scene16);
		});
		
		uEmployeeButton.setOnAction(e -> {
			updateEmployeeInfo(emp_num_u, emp_value, emp_numCB);
		});
		
		aEmployeeButton.setOnAction(e -> {
			addEmployee(emp_num, emp_fName, emp_lName, emp_role);
		});
		
		rEmployeeButton.setOnAction(e ->{
			deleteEmployee(emp_num_r);
		});
		
		//addTeam button
		addTeam.setOnAction(e -> {
			team_num.clear();
			team_name.clear();
			team_mascot.clear();
			team_home.clear();
			team_arena.clear();
			team_coach.clear();
			div_num.clear();
			stage.setScene(scene5);
		});
		
		
		//addPlayer button
		addPlayer.setOnAction(e -> {
			player_num.clear();
			player_fName.clear();
			player_lName.clear();
			team_num_p.clear();
			stage.setScene(scene6);
		});
		
		
		//addInfo button
		addInfo.setOnAction(e -> {
			stage.setScene(scene7);
		});
		
		NBACoordinationButton.setOnAction(e -> {
			role = "NBA Coordinator";
			UATextField.clear();
			stage.setScene(scene10);
		});
		
		//sqlInsert buttons
		sql.setOnAction(e -> {
			role = "Programmer";
			UATextField.clear();
			stage.setScene(scene10);
		});
		
		sqlSubmit.setOnAction(e -> {
			sqlInsert(sqlCode);
		});
		
		//add team submit button
		addTeamButton.setOnAction(e -> {
			addTeam(team_num, team_name, team_mascot,
					team_home, team_arena, team_coach,
					div_num);
		});
		
		
		//add player submit button
		addPlayerButton.setOnAction(e -> {
			addPlayer(player_num, player_fName, player_lName, team_num_p);
		});
		
		
		//add info submit button
		addInfoButton.setOnAction(e -> {
			addInfo(game_num, team_1, team_2, game_score, game_arena, game_description);
		});
		
		
		
		//help button
		help.setOnAction(e -> {
			stage.setScene(scene9);
		});
		
		
		//back buttons
		vDivBack.setOnAction(e -> {
			viewDivOutput.clear();
			divNum.clear();
			stage.setScene(scene1);
		});
		
		vTeamBack.setOnAction(e -> {
			viewTeamOutput.clear();
			teamNum.clear();
			stage.setScene(scene1);
		});
		
		vInfoBack.setOnAction(e -> {
			viewInfoOutput.clear();
			infoNum.clear();
			stage.setScene(scene1);
		});
		
		vEmployeeBack.setOnAction(e -> {
			viewEmployeeOutput.clear();
			employeeName.clear();
			stage.setScene(scene13);
		});
		
		aTeamBack.setOnAction(e -> {
			stage.setScene(scene12);
		});
		
		aPlayerBack.setOnAction(e -> {
			stage.setScene(scene12);
		});
		
		aInfoBack.setOnAction(e -> {
			stage.setScene(scene12);
		});
		
		sqlBack.setOnAction(e -> {
			sqlCode.clear();
			stage.setScene(scene1);
		});
		
		helpBack.setOnAction(e -> {
			stage.setScene(scene1);
		});
		
		UABack.setOnAction(e -> {
			UATextField.clear();
			stage.setScene(scene1);
		});
		
		NBACoordinationBack.setOnAction(e -> {
			UATextField.clear();
			stage.setScene(scene1);
		});
		
		manageEmployeeBack.setOnAction(e -> {
			stage.setScene(scene1);
		});
		
		updateEmployeeInfoBack.setOnAction(e -> {
			emp_num_u.clear();
			emp_value.clear();
			stage.setScene(scene13);
		});
		
		addEmployeeBack.setOnAction(e -> {
			emp_num.clear();
			emp_fName.clear();
			emp_lName.clear();
			emp_role.clear();
			stage.setScene(scene13);
		});
		
		deleteEmployeeBack.setOnAction(e -> {
			emp_num_r.clear();
			stage.setScene(scene13);
		});
		
		//exit button
		exit.setOnAction(e ->{
			stage.close();  
		});
		
		
		
		
		
		
		
		
		
		
		
		
		//stage configurations
		stage.centerOnScreen();
		stage.setScene(scene1);
		stage.setTitle("NBA Database");
		stage.show();
	}
	
	
	
	
	
	// main function
	public static void main(String[] args) {
		
		//System.out.println(Font.getFontNames());
		Application.launch(args);
	}
	
	
	// view teams in a division
	public static void viewDiv(TextField TextField, TextArea Output) {
		
		try {
			String query = "select * from team where div_num = " + TextField.getText() + ";";
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(query);

			while(selectResult.next()) {
				String team_num = selectResult.getString("team_num");
				String team_name = selectResult.getString("team_name");
				String team_mascot = selectResult.getString("team_mascot");
				String team_home = selectResult.getString("team_home");
				String team_arena = selectResult.getString("team_arena");
				String team_coach = selectResult.getString("team_coach");
				String div_num = selectResult.getString("div_num");
				switch(div_num) {
				case "1":
					div_num = "Northwest";
					break;
				case "2":
					div_num = "Pacific";
					break;
				case "3":
					div_num = "Southwest";
					break;
				case "4":
					div_num = "Atlantic";
					break;
				case "5":
					div_num = "Central";
					break;
				case "6":
					div_num = "Southeast";
					break;
				default:
					div_num = "N/A";
					break;
				}
				
				Output.setText("Team Number: " + team_num
						+ "\nTeam Name: " + team_name
						+ "\nTeam Mascot: " + team_mascot
						+ "\nTeam Home State: " + team_home
						+ "\nTeam Home Court: " + team_arena
						+ "\nTeam Head Coach: " + team_coach
						+ "\nDivision: " + div_num
						+ "\n\n" + Output.getText());
			}
			
			statement.close();
			conn.close();
		
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	
	
	// view players on a team
	public static void viewTeam(TextField TextField, TextArea Output) {
		
		try {
			
			String query = "select * from player where team_num = " + TextField.getText() + ";";
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(query);

			while(selectResult.next()) {
				String player_num = selectResult.getString("player_num");
				String player_fName = selectResult.getString("player_fName");
				String player_lName = selectResult.getString("player_lName");
				String team_num = selectResult.getString("team_num");
				
				Output.setText("Player Number: " + player_num
						+ "\nPlayer First Name: " + player_fName
						+ "\nPlayer Last Name: " + player_lName
						+ "\nPlayers' Team Number: " + team_num
						+ "\n\n" + Output.getText());
			}
			
			statement.close();
			conn.close();
		
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	//view game information
	public static void viewGameInfo(TextField TextField, TextArea Output) {
		
		try {
			String query = "select * from game where game_num = " + TextField.getText() + ";";
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(query);

			while(selectResult.next()) {
				String game_num = selectResult.getString("game_num");
				String team_1 = selectResult.getString("team_1");
				String team_2 = selectResult.getString("team_2");
				String game_score = selectResult.getString("game_score");
				String game_arena = selectResult.getString("game_arena");
				String game_description = selectResult.getString("game_description");
				
				Output.setText("Game Number: " + game_num
						+ "\nHome Team Name: " + team_1
						+ "\nAway Team Name: " + team_2
						+ "\nFinal Game Score: " + game_score
						+ "\nGame Court: " + game_arena
						+ "\nGame Description: " + game_description
						+ "\n\n" + Output.getText());
			}
			
			statement.close();
			conn.close();
		
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	//view employee information
	public static void viewEmployeeInfo(TextField TextField, TextArea Output) {
		
		try {
			String query = "select * from employee where emp_fName = '" + TextField.getText() + "';";
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(query);

			while(selectResult.next()) {
				String emp_num = selectResult.getString("emp_num");
				String emp_fName = selectResult.getString("emp_fName");
				String emp_lName = selectResult.getString("emp_lName");
				String emp_role = selectResult.getString("emp_role");
				
				Output.setText("Employee Number: " + emp_num
						+ "\nFirst Name: " + emp_fName
						+ "\nLast Name: " + emp_lName
						+ "\nJob Title: " + emp_role
						+ "\n\n" + Output.getText());
			}
			
			statement.close();
			conn.close();
		
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	//update employee information
	public static void updateEmployeeInfo(TextField emp_num, TextField value, ComboBox<String> CB) {
		
		try {
			String CBcontent = "";
			String query = "";
			System.out.println(CB.getValue());
			if(CB.getValue().contentEquals("Employee Number")){
				CBcontent = "emp_num";
			}else if(CB.getValue().contentEquals("Employee First Name")){
				CBcontent = "emp_fName";
			}else if(CB.getValue().contentEquals("Employee Last Name")) {
				CBcontent = "emp_lName";
			}else if(CB.getValue().contentEquals("Employee Job Title")) {
				CBcontent = "emp_role";
			}
			
			if(CBcontent.contentEquals("emp_num") || CBcontent.contentEquals("emp_salary")) {
				query = "update EMPLOYEE set " + CBcontent + " = " + value.getText() + " where emp_num = " + emp_num.getText() + ";";
			} else {
				query = "update EMPLOYEE set " + CBcontent + " = '" + value.getText() + "' where emp_num = " + emp_num.getText() + ";";
			}
			System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	//add employee to database
	public static void addEmployee(TextField emp_num, TextField emp_fName, TextField emp_lName, TextField emp_role) {
		
		try {
			String query = "insert into EMPLOYEE values(" + emp_num.getText() + ", '" + emp_fName.getText() + "', '" + emp_lName.getText() + "', '" + emp_role.getText() + "');";
			//System.out.println(query);
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	//remove employee from database
	public static void deleteEmployee(TextField emp_num) {
		
		try {
			String query = "delete from EMPLOYEE where emp_num = " + emp_num.getText() + ";";
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	
	//submit query statement directly
	public static void sqlInsert(TextArea TextArea) {
		try {
			String query = TextArea.getText();
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
			
		}catch(SQLException e) {
			TextArea.setText("Error: " + e.getMessage());
		}
		
		
	}
	
	
	//method for adding a team to the NBA
	public static void addTeam(TextField team_num, TextField team_name, TextField team_mascot,
			TextField team_home, TextField team_arena, TextField team_coach, TextField div_num) {
		try {
			String teamNum = team_num.getText();
			String teamName = team_name.getText();
			String teamMascot = team_mascot.getText();
			String teamHome = team_home.getText();
			String teamArena = team_arena.getText();
			String teamCoach = team_coach.getText();
			String divNum = div_num.getText();
			
	
				
			String query = "insert into TEAM values(" + teamNum + ", '" + teamName
					+ "', '" + teamMascot + "', '" + teamHome + "', '" + teamArena
					+ "', '" + teamCoach + "', " + divNum + ");";
			//System.out.println(query);
				
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");				
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
	}
	
	
	
	//method for adding a player to a team in the NBA
	public static void addPlayer(TextField player_num, TextField player_fName, 
			TextField player_lName, TextField team_num) {
		try {
			String playerNum = player_num.getText();
			String playerfName = player_fName.getText();
			String playerlName = player_lName.getText();
			String teamNum = team_num.getText();
				
			String query = "insert into PLAYER values(" + playerNum + ", '" + playerfName
					+ "', '" + playerlName + "', " + teamNum + ");";
			//System.out.println(query);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
	}
	
	
	
	//method for adding game information
	public static void addInfo(TextField game_num, TextField team_1, TextField team_2,
			TextField game_score, TextField game_arena, TextField game_description) {
		
		
		try {
			String gameNum = game_num.getText();
			String team1 = team_1.getText();
			String team2 = team_2.getText();
			String gameScore = game_score.getText();
			String gameArena = game_arena.getText();
			String gameDescription = game_description.getText();
			
			
			String query = "insert into GAME values(" + gameNum + ", '" + team1
					+ "', '" + team2 + "', '" + gameScore + "', '" + gameArena
					+ "', '" + gameDescription + "');";
			//System.out.println(query);
				
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			statement.execute(query);
			
			statement.close();
			conn.close();
			
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
	}
	
	
	//check user number for user authentication for programmers
	public static boolean userAuthenticationP(TextField TextField, Boolean accessGranted) {
		try {
			String input = TextField.getText();
			String usernum = "select emp_num from EMPLOYEE where emp_role = 'Programmer';";
			//System.out.println(usernum);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(usernum);
			
			while(selectResult.next()) {
				
				usernum = selectResult.getString("emp_num");
				
				if(usernum.contentEquals(input)) {
					accessGranted = true;
					break;
				}else {
					accessGranted = false;
				}
				
				//System.out.println(accessGranted);
			
			}
			
			statement.close();
			conn.close();
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
		return accessGranted;
	}
	
	
	//check user number for user authentication for managers
	public static boolean userAuthenticationM(TextField TextField, Boolean accessGranted) {
		try {
			String input = TextField.getText();
			String usernum = "select emp_num from EMPLOYEE where emp_role = 'Manager';";
			//System.out.println(usernum);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(usernum);
			
			while(selectResult.next()) {
				
				usernum = selectResult.getString("emp_num");
				
				if(usernum.contentEquals(input)) {
					accessGranted = true;
					break;
				}else {
					accessGranted = false;
				}
				
				//System.out.println(accessGranted);
			
			}
			
			statement.close();
			conn.close();
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
		return accessGranted;
	}
	
	
	//check user number for user authentication for NBA Coordinators
	public static boolean userAuthenticationC(TextField TextField, Boolean accessGranted) {
		try {
			String input = TextField.getText();
			String usernum = "select emp_num from EMPLOYEE where emp_role = 'NBA Coordinator';";
			//System.out.println(usernum);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:A:\\Program Files (x86)\\Eclipse\\Java_DB\\database\\NBA_DB.db");
			Statement statement  = conn.createStatement();
			ResultSet selectResult = statement.executeQuery(usernum);
			
			while(selectResult.next()) {
				
				usernum = selectResult.getString("emp_num");
				
				if(usernum.contentEquals(input)) {
					accessGranted = true;
					break;
				}else {
					accessGranted = false;
				}
				
				//System.out.println(accessGranted);
			
			}
			
			statement.close();
			conn.close();
		}catch(SQLException e) {
			//TextArea.setText("Error: " + e.getMessage());
		}
		
		return accessGranted;
	}

}





//use labeled methods with labels (contentDisplay, textFill, etc...)




/* Sample SQL code
create table FOOD (
food_num INTEGER UNIQUE NOT NULL,
food_name CHAR(20) UNIQUE NOT NULL,
PRIMARY KEY(food_num)
);

*/

