package generalvrp.load;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.math3.distribution.*;

import com.google.gson.Gson;

import entity.Distribution;
import entity.GeneralInstance;
import entity.Order;
import entity.Parameter;
import entity.Place;
import entity.Vehicle;
import generalvrp.vo.GeneralInstanceVO;
import generalvrp.vo.OrderVO;
import generalvrp.vo.ParameterVO;
import generalvrp.vo.PlaceVO;
import generalvrp.vo.VehicleVO;

public class LoadInstance {

	GeneralInstanceVO generalInstance;

	public GeneralInstance recInstances(String fileName) throws IOException {

		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));

		// AbstractRealDistribution x = new NormalDistribution(0, 1);

		// Leitura do arquivo json e Transformação em Objeto.
		Gson gson = new Gson();
		generalInstance = new Gson().fromJson(json, GeneralInstanceVO.class);
		String saidaInstanciaGeral = gson.toJson(generalInstance);
		System.out.println(saidaInstanciaGeral);

		return convertVoToEntity(generalInstance);

	}

	private GeneralInstance convertVoToEntity(GeneralInstanceVO generalInstanceVO) {

		List<Order> orders = this.orderVoToOrder(generalInstanceVO.orders);
		Parameter parameter = this.parameterVOToParameter(generalInstanceVO.parameters);
		List<Place> places = this.placesVOToPlace(generalInstanceVO.places);
		List<Vehicle> vehicles = this.vehicleVOToVehicle(generalInstanceVO.vehicles);

		GeneralInstance generalInstance = new GeneralInstance(parameter, places, vehicles, orders);

		return generalInstance;
	}

	private List<Order> orderVoToOrder(List<OrderVO> ordersVO) {
		List<Order> orders = new ArrayList<Order>();

		for (OrderVO order : ordersVO) {
			Order newOrder = new Order();
			newOrder.beginTimeWindow = order.beginTimeWindow;
			newOrder.endTimeWindow = order.endTimeWindow;
			newOrder.frequency = order.frequency;
			newOrder.from = order.from;
			newOrder.id = order.id;
			newOrder.to = order.to;
			newOrder.positivation = order.positivation;
			newOrder.priority = order.priority;
			newOrder.serviceTime = order.serviceTime;
			newOrder.vehicleCompatible = order.vehicleCompatible;
			newOrder.vehicleFixed = order.vehicleFixed;
			newOrder.weight = new Distribution<>();
			newOrder.weight.val1 = order.weight.val1;
			newOrder.weight.val2 = order.weight.val2;
			newOrder.weight.type = order.weight.type;
			if (!order.weight.type.equals("NONSTOCATISC")) {
				switch (order.weight.type) {
				case NORMAL:
					newOrder.weight.distribuction = new NormalDistribution(newOrder.weight.val1, newOrder.weight.val2);
					break;
				case LOGNORMAL:
					newOrder.weight.distribuction = new LogNormalDistribution(newOrder.weight.val1,
							newOrder.weight.val2);

					break;
				case UNIFORM:
					newOrder.weight.distribuction = new UniformRealDistribution(newOrder.weight.val1,
							newOrder.weight.val2);

					break;

				default:
					break;
				}
			}
			newOrder.cubage = new Distribution<>();
			newOrder.cubage.val1 = order.cubage.val1;
			newOrder.cubage.val2 = order.cubage.val2;
			newOrder.cubage.type = order.cubage.type;
			if (!order.cubage.type.equals("NONSTOCATISC")) {
				switch (order.cubage.type) {
				case NORMAL:
					newOrder.cubage.distribuction = new NormalDistribution(newOrder.cubage.val1, newOrder.cubage.val2);
					break;
				case LOGNORMAL:
					newOrder.cubage.distribuction = new LogNormalDistribution(newOrder.cubage.val1,
							newOrder.cubage.val2);

					break;
				case UNIFORM:
					newOrder.cubage.distribuction = new UniformRealDistribution(newOrder.cubage.val1,
							newOrder.cubage.val2);

					break;

				default:
					break;
				}
			}
			newOrder.volume = new Distribution<>();
			newOrder.volume.val1 = order.volume.val1;
			newOrder.volume.val2 = order.volume.val2;
			newOrder.volume.type = order.volume.type;
			if (!order.volume.type.equals("NONSTOCATISC")) {
				switch (order.volume.type) {
				case NORMAL:
					newOrder.volume.distribuction = new NormalDistribution(newOrder.volume.val1, newOrder.volume.val2);
					break;
				case LOGNORMAL:
					newOrder.volume.distribuction = new LogNormalDistribution(newOrder.volume.val1,
							newOrder.volume.val2);

					break;
				case UNIFORM:
					newOrder.volume.distribuction = new UniformRealDistribution(newOrder.volume.val1,
							newOrder.volume.val2);

					break;

				default:
					break;
				}
			}
			newOrder.containers = new Distribution<>();
			newOrder.containers.val1 = order.containers.val1;
			newOrder.containers.val2 = order.containers.val2;
			newOrder.containers.type = order.containers.type;
			if (!order.containers.type.equals("NONSTOCATISC")) {
				switch (order.containers.type) {
				case NORMAL:
					newOrder.containers.distribuction = new NormalDistribution(newOrder.containers.val1,
							newOrder.containers.val2);
					break;
				case LOGNORMAL:
					newOrder.containers.distribuction = new LogNormalDistribution(newOrder.containers.val1,
							newOrder.containers.val2);

					break;
				case UNIFORM:
					newOrder.containers.distribuction = new UniformRealDistribution(newOrder.containers.val1,
							newOrder.containers.val2);

					break;

				default:
					break;
				}
			}
			newOrder.monetaryValue = new Distribution<>();
			newOrder.monetaryValue.val1 = order.monetaryValue.val1;
			newOrder.monetaryValue.val2 = order.monetaryValue.val2;
			newOrder.monetaryValue.type = order.monetaryValue.type;
			if (!order.monetaryValue.type.equals("NONSTOCATISC")) {
				switch (order.monetaryValue.type) {
				case NORMAL:
					newOrder.monetaryValue.distribuction = new NormalDistribution(newOrder.monetaryValue.val1,
							newOrder.monetaryValue.val2);
					break;
				case LOGNORMAL:
					newOrder.monetaryValue.distribuction = new LogNormalDistribution(newOrder.monetaryValue.val1,
							newOrder.monetaryValue.val2);

					break;
				case UNIFORM:
					newOrder.monetaryValue.distribuction = new UniformRealDistribution(newOrder.monetaryValue.val1,
							newOrder.monetaryValue.val2);

					break;

				default:
					break;
				}
			}

			orders.add(newOrder);
		}
		return orders;
	}

	private Parameter parameterVOToParameter(ParameterVO parameterVO) {
		Parameter parameter = new Parameter();
		parameter.distanceTotal = parameterVO.distanceTotal;
		parameter.isMultiperiod = parameterVO.isMultiperiod;
		parameter.isOpenRoute = parameterVO.isOpenRoute;
		parameter.lunchTime = parameterVO.lunchTime;
		parameter.routeLenghtLimit = parameterVO.routeLenghtLimit;
		parameter.useTimeWindows = parameterVO.useTimeWindows;

		return parameter;
	}

	private List<Place> placesVOToPlace(List<PlaceVO> placesVO) {

		List<Place> places = new ArrayList<Place>();

		for (PlaceVO place : placesVO) {
			Place newPlace = new Place();
			newPlace.beginOperation = place.beginOperation;
			newPlace.endOperation = place.endOperation;
			newPlace.id = place.id;
			newPlace.type = place.type;
			newPlace.vehicleCompatible = place.vehicleCompatible;
			newPlace.x = place.x;
			newPlace.y = place.y;

			places.add(newPlace);
		}

		return places;
	}

	private List<Vehicle> vehicleVOToVehicle(List<VehicleVO> vehicleVO) {

		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		for (VehicleVO vehicle : vehicleVO) {
			Vehicle newVehicle = new Vehicle();

			newVehicle.id = vehicle.id;
			newVehicle.containersLimit = vehicle.containersLimit;
			newVehicle.cubageLimit = vehicle.cubageLimit;
			newVehicle.volumeLimit = vehicle.volumeLimit;
			newVehicle.weightLimit = vehicle.weightLimit;
			newVehicle.monetaryLimit = vehicle.monetaryLimit;
			newVehicle.type = vehicle.type;
			newVehicle.distributionCenter = vehicle.distributionCenter;

			vehicles.add(newVehicle);
		}

		return vehicles;
	}
}
