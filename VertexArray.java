import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.geom.Point2D;
import java.awt.Point;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.EventObject;
import javafx.event.Event;
import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.control.Control;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.ColorPicker;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Object;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Control;
import javafx.scene.control.ChoiceBox;

import java.lang.Object;
import javafx.stage.Window;
import javafx.stage.PopupWindow;
import javafx.scene.control.PopupControl;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

//Elliot's VertexArray class

public class VertexArray
{
	static public Vertex[] vertexArray = new Vertex[100];//Bigger than needed for now
	
	/* Currently has 50 vertices, to add more copy-paste this:
	Vertex vertexi = new Vertex();
	vertexArray[i] = vertexi;
	And then use cntrl-F to find "i" and replace with new number
	Also make sure to not exceed array length or to increase the length
	*/

	public VertexArray(int vertices){

		for(int i=0;i<60;i++){
			MenuItemArray.doneColors[i]=-1;
		}

		Vertex vertex0 = new Vertex();
		vertexArray[0] = vertex0;

		Vertex vertex1 = new Vertex();
		vertexArray[1] = vertex1;

		Vertex vertex2 = new Vertex();
		vertexArray[2] = vertex2;

		Vertex vertex3 = new Vertex();
		vertexArray[3] = vertex3;

		Vertex vertex4 = new Vertex();
		vertexArray[4] = vertex4;

		Vertex vertex5 = new Vertex();
		vertexArray[5] = vertex5;

		Vertex vertex6 = new Vertex();
		vertexArray[6] = vertex6;

		Vertex vertex7 = new Vertex();
		vertexArray[7] = vertex7;

		Vertex vertex8 = new Vertex();
		vertexArray[8] = vertex8;

		Vertex vertex9 = new Vertex();
		vertexArray[9] = vertex9;

		Vertex vertex10 = new Vertex();
		vertexArray[10] = vertex10;

		Vertex vertex11 = new Vertex();
		vertexArray[11] = vertex11;

		Vertex vertex12 = new Vertex();
		vertexArray[12] = vertex12;

		Vertex vertex13 = new Vertex();
		vertexArray[13] = vertex13;

		Vertex vertex14 = new Vertex();
		vertexArray[14] = vertex14;

		Vertex vertex15 = new Vertex();
		vertexArray[15] = vertex15;

		Vertex vertex16 = new Vertex();
		vertexArray[16] = vertex16;

		Vertex vertex17 = new Vertex();
		vertexArray[17] = vertex17;

		Vertex vertex18 = new Vertex();
		vertexArray[18] = vertex18;

		Vertex vertex19 = new Vertex();
		vertexArray[19] = vertex19;

		Vertex vertex20 = new Vertex();
		vertexArray[20] = vertex20;

		Vertex vertex21 = new Vertex();
		vertexArray[21] = vertex21;

		Vertex vertex22 = new Vertex();
		vertexArray[22] = vertex22;

		Vertex vertex23 = new Vertex();
		vertexArray[23] = vertex23;

		Vertex vertex24 = new Vertex();
		vertexArray[24] = vertex24;

		Vertex vertex25 = new Vertex();
		vertexArray[25] = vertex25;

		Vertex vertex26 = new Vertex();
		vertexArray[26] = vertex26;

		Vertex vertex27 = new Vertex();
		vertexArray[27] = vertex27;

		Vertex vertex28 = new Vertex();
		vertexArray[28] = vertex28;

		Vertex vertex29 = new Vertex();
		vertexArray[29] = vertex29;

		Vertex vertex30 = new Vertex();
		vertexArray[30] = vertex30;

		Vertex vertex31 = new Vertex();
		vertexArray[31] = vertex31;

		Vertex vertex32 = new Vertex();
		vertexArray[32] = vertex32;

		Vertex vertex33 = new Vertex();
		vertexArray[33] = vertex33;

		Vertex vertex34 = new Vertex();
		vertexArray[34] = vertex34;

		Vertex vertex35 = new Vertex();
		vertexArray[35] = vertex35;

		Vertex vertex36 = new Vertex();
		vertexArray[36] = vertex36;

		Vertex vertex37 = new Vertex();
		vertexArray[37] = vertex37;

		Vertex vertex38 = new Vertex();
		vertexArray[38] = vertex38;

		Vertex vertex39 = new Vertex();
		vertexArray[39] = vertex39;

		Vertex vertex40 = new Vertex();
		vertexArray[40] = vertex40;

		Vertex vertex41 = new Vertex();
		vertexArray[41] = vertex41;

		Vertex vertex42 = new Vertex();
		vertexArray[42] = vertex42;

		Vertex vertex43 = new Vertex();
		vertexArray[43] = vertex43;

		Vertex vertex44 = new Vertex();
		vertexArray[44] = vertex44;

		Vertex vertex45 = new Vertex();
		vertexArray[45] = vertex45;

		Vertex vertex46 = new Vertex();
		vertexArray[46] = vertex46;

		Vertex vertex47 = new Vertex();
		vertexArray[47] = vertex47;

		Vertex vertex48 = new Vertex();
		vertexArray[48] = vertex48;

		Vertex vertex49 = new Vertex();
		vertexArray[49] = vertex49;

		Vertex vertex50 = new Vertex();
		vertexArray[50] = vertex50;

	}
}
